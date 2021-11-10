package co.com.sofka.racehorse.domain.game.event;

import co.com.sofka.racehorse.domain.game.values.LevelPlayer;
import co.com.sofka.racehorse.domain.game.values.Name;
import co.com.sofka.racehorse.domain.game.values.PlayerId;
import co.com.sofka.racehorse.domain.generic.DomainEvent;

public class PlayerAssigned extends DomainEvent {

    private final PlayerId playerId;
    private final Name name;
    private final LevelPlayer levelPlayer;

    public PlayerAssigned(PlayerId playerId, Name name, LevelPlayer levelPlayer) {
        super("sofkau.game.playercreated");
        this.playerId = playerId;
        this.name = name;
        this.levelPlayer = levelPlayer;
    }

    public PlayerId getPlayerId() {
        return playerId;
    }

    public Name getName() {
        return name;
    }

    public LevelPlayer getLevelPlayer() {
        return levelPlayer;
    }
}
