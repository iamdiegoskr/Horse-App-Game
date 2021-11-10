package co.com.sofka.racehorse.usecases;

import co.com.sofka.racehorse.domain.game.command.CreateGameCommand;
import co.com.sofka.racehorse.domain.generic.DomainEvent;
import co.com.sofka.racehorse.domain.game.Game;

import javax.enterprise.context.Dependent;
import java.util.List;
import java.util.function.Function;

@Dependent
public class CreateGameUseCase implements Function<CreateGameCommand, List<DomainEvent>> {
    @Override
    public List<DomainEvent> apply(CreateGameCommand command) {
        var game = new Game(command.getGameId(), command.getWinningAward());
        return game.getUncommittedChanges();
    }
}
