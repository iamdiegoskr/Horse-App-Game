package co.com.sofka.racehorse.infra.handle;

import co.com.sofka.racehorse.domain.game.command.CreateGameCommand;
import co.com.sofka.racehorse.infra.generic.UseCaseHandle;
import co.com.sofka.racehorse.usecases.CreateGameUseCase;
import io.quarkus.vertx.ConsumeEvent;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CreateGameUseCaseHandle extends UseCaseHandle {

    private final CreateGameUseCase createGameUseCase;

    public CreateGameUseCaseHandle(CreateGameUseCase createGameUseCase) {
        this.createGameUseCase = createGameUseCase;
    }

    @ConsumeEvent(value = "sofka.game.gamecreated")
    void consumeBlocking(CreateGameCommand command) {
        var events = createGameUseCase.apply(command);
        saveGame(command.getGameId(), events);
    }
}