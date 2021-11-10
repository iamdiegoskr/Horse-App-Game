package co.com.sofka.racehorse.domain.game.event;

import co.com.sofka.racehorse.domain.game.values.Kilometers;
import co.com.sofka.racehorse.domain.game.values.LaneId;
import co.com.sofka.racehorse.domain.game.values.TrackId;
import co.com.sofka.racehorse.domain.generic.DomainEvent;

public class TrackAssigned extends DomainEvent {

    private final TrackId trackId;
    private final Kilometers kilometers;
    private final LaneId laneId;

    public TrackAssigned(TrackId trackId, Kilometers kilometers, LaneId laneId) {
        super("sofkau.game.trackcreated");
        this.trackId = trackId;
        this.kilometers = kilometers;
        this.laneId = laneId;
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
