package co.com.sofka.racehorse.infra.generic;

import co.com.sofka.racehorse.domain.game.values.GameId;
import co.com.sofka.racehorse.domain.generic.DomainEvent;
import co.com.sofka.racehorse.domain.generic.EventStoreRepository;
import co.com.sofka.racehorse.domain.generic.StoredEvent;
import co.com.sofka.racehorse.infra.message.BusService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.Date;
import java.util.List;

@ApplicationScoped
public abstract class UseCaseHandle {
    @Inject
    private  EventStoreRepository repository;

    @Inject
    private BusService busService;

    public void saveGame(GameId gameId, List<DomainEvent> events) {
        events.stream().map(event -> {
            String eventBody = EventSerializer.instance().serialize(event);
            return new StoredEvent(event.getClass().getTypeName(), new Date(), eventBody);
        }).forEach(storedEvent -> repository.saveEvent("game", gameId, storedEvent));

        events.forEach(busService::send);
    }
}
