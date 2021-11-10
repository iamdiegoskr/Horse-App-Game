package co.com.sofka.racehorse.domain.game.command;


import co.com.sofka.racehorse.domain.game.values.GameId;
import co.com.sofka.racehorse.domain.game.values.WinningAward;
import co.com.sofka.racehorse.domain.generic.Command;

public class CreateGameCommand extends Command {

    private GameId gameId;
    private WinningAward winningAward;

    public CreateGameCommand(){

    }

    public CreateGameCommand(GameId gameId, WinningAward winningAward) {
        this.gameId = gameId;
        this.winningAward = winningAward;
    }

    public GameId getGameId() {
        return gameId;
    }

    public WinningAward getWinningAward() {
        return winningAward;
    }
}
