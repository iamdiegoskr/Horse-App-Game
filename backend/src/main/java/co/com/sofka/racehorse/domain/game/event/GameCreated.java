package co.com.sofka.racehorse.domain.game.event;

import co.com.sofka.racehorse.domain.game.values.WinningAward;
import co.com.sofka.racehorse.domain.generic.DomainEvent;

public class GameCreated extends DomainEvent {

    private final WinningAward winningAward;

    public GameCreated(WinningAward winningAward) {
        super("sofka.game.gamecreated");
        this.winningAward = winningAward;
    }

    public WinningAward getWinningAward() {
        return winningAward;
    }
}
