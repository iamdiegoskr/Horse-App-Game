package co.com.sofka.racehorse.domain.game.values;

import co.com.sofka.racehorse.domain.generic.Identity;

public class TrackId extends Identity {

    public TrackId(){
    }

    private TrackId(String id){
        super(id);
    }

    public static TrackId  of(String id){
        return new TrackId(id);
    }

}
