package co.com.sofka.racehorse.domain.game;

import co.com.sofka.racehorse.domain.game.values.LevelPlayer;
import co.com.sofka.racehorse.domain.game.values.Name;
import co.com.sofka.racehorse.domain.game.values.PlayerId;
import co.com.sofka.racehorse.domain.generic.Entity;

public class Player extends Entity<PlayerId> {

    private final Name name;
    private final LevelPlayer level;


    public Player(PlayerId playerId, Name name, LevelPlayer level) {
        super(playerId);
        this.name = name;
        this.level = level;
    }

    public Name name() {
        return name;
    }

    public LevelPlayer level() {
        return level;
    }
}