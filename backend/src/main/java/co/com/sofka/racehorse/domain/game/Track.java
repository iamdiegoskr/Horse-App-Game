package co.com.sofka.racehorse.domain.game;

import co.com.sofka.racehorse.domain.game.values.Kilometers;
import co.com.sofka.racehorse.domain.game.values.LaneId;
import co.com.sofka.racehorse.domain.game.values.TrackId;
import co.com.sofka.racehorse.domain.generic.Entity;

public class Track extends Entity<TrackId> { //PISTA

    private final Kilometers kilometers;
    private final LaneId laneId;

    public Track(TrackId trackId, Kilometers kilometers, LaneId laneId) {
        super(trackId);
        this.kilometers = kilometers;
        this.laneId = laneId;
    }

    public Kilometers limitDistance() {
        return kilometers;
    }

    public LaneId laneId() {
        return laneId;
    }
}
