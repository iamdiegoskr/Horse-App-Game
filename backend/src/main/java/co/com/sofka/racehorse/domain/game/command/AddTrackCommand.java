package co.com.sofka.racehorse.domain.game.command;

import co.com.sofka.racehorse.domain.game.Track;
import co.com.sofka.racehorse.domain.game.values.GameId;
import co.com.sofka.racehorse.domain.game.values.Kilometers;
import co.com.sofka.racehorse.domain.game.values.LaneId;
import co.com.sofka.racehorse.domain.game.values.TrackId;
import co.com.sofka.racehorse.domain.generic.Command;

import java.util.List;

public class AddTrackCommand extends Command {

    private GameId gameId;
    private TrackId trackId;
    private Kilometers kilometers;
    private LaneId laneId;

    public AddTrackCommand(){

    }

    public GameId getGameId() {
        return gameId;
    }

    public TrackId getTrackId() {
        return trackId;
    }

    public Kilometers getKilometers() {
        return kilometers;
    }

    public LaneId getLaneId() {
        return laneId;
    }
}
