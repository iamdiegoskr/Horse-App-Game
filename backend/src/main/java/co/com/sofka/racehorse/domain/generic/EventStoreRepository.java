package co.com.sofka.racehorse.domain.generic;

import co.com.sofka.racehorse.domain.game.Game;
import co.com.sofka.racehorse.domain.game.values.GameId;

import java.util.List;



public interface EventStoreRepository {

    List<DomainEvent> getEventsBy(String aggregateName, GameId aggregateRootId);


    void saveEvent(String aggregateName, GameId aggregateRootId, StoredEvent storedEvent);

}