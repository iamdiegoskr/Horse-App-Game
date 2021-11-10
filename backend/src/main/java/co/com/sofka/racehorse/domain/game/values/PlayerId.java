package co.com.sofka.racehorse.domain.game.values;

import co.com.sofka.racehorse.domain.generic.Identity;

public class PlayerId extends Identity {

    public PlayerId(){
    }

    private PlayerId(String id){
        super(id);
    }

    public static PlayerId  of(String id){
        return new PlayerId(id);
    }
}
