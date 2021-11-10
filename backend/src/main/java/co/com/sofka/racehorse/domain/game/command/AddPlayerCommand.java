package co.com.sofka.racehorse.domain.game.command;

import co.com.sofka.racehorse.domain.game.values.GameId;
import co.com.sofka.racehorse.domain.game.values.LevelPlayer;
import co.com.sofka.racehorse.domain.game.values.Name;
import co.com.sofka.racehorse.domain.game.values.PlayerId;
import co.com.sofka.racehorse.domain.generic.Command;

public class AddPlayerCommand extends Command {

    private GameId gameId;
    private PlayerId playerId;
    private Name name;
    private LevelPlayer level;

    public AddPlayerCommand(){

    }

    public GameId getGameId() {
        return gameId;
    }

    public PlayerId getPlayerId() {
        return playerId;
    }

    public Name getName() {
        return name;
    }

    public LevelPlayer getLevel() {
        return level;
    }
}
