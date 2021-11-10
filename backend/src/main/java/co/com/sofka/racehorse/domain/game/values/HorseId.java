package co.com.sofka.racehorse.domain.game.values;


import co.com.sofka.racehorse.domain.generic.Identity;

public class HorseId extends Identity {

    public HorseId(){
    }

    private HorseId(String id){
        super(id);
    }

    public static HorseId of(String id){
        return new HorseId(id);
    }
}
