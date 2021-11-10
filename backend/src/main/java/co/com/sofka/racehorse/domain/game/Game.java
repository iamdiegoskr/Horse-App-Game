package co.com.sofka.racehorse.domain.game;

import co.com.sofka.racehorse.domain.game.event.GameCreated;
import co.com.sofka.racehorse.domain.game.event.PlayerAssigned;
import co.com.sofka.racehorse.domain.game.event.TrackAssigned;
import co.com.sofka.racehorse.domain.game.values.*;
import co.com.sofka.racehorse.domain.generic.AggregateRoot;
import co.com.sofka.racehorse.domain.generic.DomainEvent;


import java.util.List;
import java.util.Set;

public class Game extends AggregateRoot {

    protected Track track;
    protected Set<Player> players;
    protected Podium podium;
    protected Boolean isPlaying;
    protected WinningAward winningAward;

    public Game(GameId gameId, WinningAward winningAward) {
        super(gameId.value());
        appendChange(new GameCreated(winningAward)).apply();
    }

    private Game(GameId gameId){
        super(gameId.value());
        subscribe(new GameEventChange(this));
    }

    public static Game from(GameId gameId, List<DomainEvent> events){
        var game = new Game(gameId);
        events.forEach(game::applyEvent);
        return game;
    }

    public void addTrack(TrackId trackId, Kilometers kilometers, LaneId laneId){
        appendChange(new TrackAssigned(trackId, kilometers, laneId)).apply();
    }

    public void addPlayer(PlayerId playerId, Name name, LevelPlayer levelPlayer){
        appendChange(new PlayerAssigned(playerId, name, levelPlayer)).apply();
    }

}
