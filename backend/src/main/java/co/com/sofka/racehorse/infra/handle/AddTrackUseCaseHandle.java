package co.com.sofka.racehorse.infra.handle;

import co.com.sofka.racehorse.domain.game.command.AddTrackCommand;

import co.com.sofka.racehorse.infra.generic.UseCaseHandle;
import co.com.sofka.racehorse.usecases.AddTrackUseCase;

import io.quarkus.vertx.ConsumeEvent;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class AddTrackUseCaseHandle extends UseCaseHandle {
    private final AddTrackUseCase addTrackUseCase;

    public AddTrackUseCaseHandle(AddTrackUseCase addTrackUseCase) {
        this.addTrackUseCase = addTrackUseCase;
    }

    @ConsumeEvent(value = "sofkau.game.trackcreated")
    void consumeBlocking(AddTrackCommand command) {
        var events = addTrackUseCase.apply(command);
        saveGame(command.getGameId(), events);
    }


}