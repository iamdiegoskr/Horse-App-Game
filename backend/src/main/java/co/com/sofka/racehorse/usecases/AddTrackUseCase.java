package co.com.sofka.racehorse.usecases;

import co.com.sofka.racehorse.domain.generic.DomainEvent;
import co.com.sofka.racehorse.domain.generic.EventStoreRepository;
import co.com.sofka.racehorse.domain.game.Game;
import co.com.sofka.racehorse.domain.game.command.AddTrackCommand;

import javax.enterprise.context.Dependent;
import java.util.List;
import java.util.function.Function;

@Dependent
public class AddTrackUseCase implements Function<AddTrackCommand, List<DomainEvent>> {

    private final EventStoreRepository repository;

    public AddTrackUseCase(EventStoreRepository repository){
        this.repository = repository;
    }

    @Override
    public List<DomainEvent> apply(AddTrackCommand command) {
        var events = repository.getEventsBy("game", command.getGameId());
        var game = Game.from(command.getGameId(), events);

        game.addTrack(command.getTrackId(), command.getKilometers(), command.getLaneId());
        return game.getUncommittedChanges();
    }
}
