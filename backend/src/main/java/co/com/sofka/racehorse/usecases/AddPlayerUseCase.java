package co.com.sofka.racehorse.usecases;

import co.com.sofka.racehorse.domain.game.Game;
import co.com.sofka.racehorse.domain.game.command.AddPlayerCommand;
import co.com.sofka.racehorse.domain.generic.DomainEvent;
import co.com.sofka.racehorse.domain.generic.EventStoreRepository;

import javax.enterprise.context.Dependent;
import java.util.List;
import java.util.function.Function;

@Dependent
public class AddPlayerUseCase implements Function<AddPlayerCommand, List<DomainEvent>> {

    private final EventStoreRepository repository;

    public AddPlayerUseCase(EventStoreRepository repository){
        this.repository = repository;
    }

    @Override
    public List<DomainEvent> apply(AddPlayerCommand command) {
        var events = repository.getEventsBy("game", command.getGameId());
        var game = Game.from(command.getGameId(), events);

        game.addPlayer(command.getPlayerId(), command.getName(), command.getLevel());
        return game.getUncommittedChanges();
    }

}
