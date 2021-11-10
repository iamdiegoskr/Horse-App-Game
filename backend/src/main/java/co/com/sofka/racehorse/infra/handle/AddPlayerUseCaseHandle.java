package co.com.sofka.racehorse.infra.handle;

import co.com.sofka.racehorse.domain.game.command.AddPlayerCommand;
import co.com.sofka.racehorse.infra.generic.UseCaseHandle;
import co.com.sofka.racehorse.usecases.AddPlayerUseCase;
import io.quarkus.vertx.ConsumeEvent;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class AddPlayerUseCaseHandle extends UseCaseHandle {
    private final AddPlayerUseCase addPlayerUseCase;

    public AddPlayerUseCaseHandle(AddPlayerUseCase addPlayerUseCase) {
        this.addPlayerUseCase = addPlayerUseCase;
    }

    @ConsumeEvent(value = "sofkau.game.playercreated")
    void consumeBlocking(AddPlayerCommand command) {
        var events = addPlayerUseCase.apply(command);
        saveGame(command.getGameId(), events);
    }

}