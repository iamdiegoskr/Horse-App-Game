package co.com.sofka.racehorse.domain.game;

import co.com.sofka.racehorse.domain.game.event.GameCreated;
import co.com.sofka.racehorse.domain.game.event.TrackAssigned;
import co.com.sofka.racehorse.domain.game.values.Podium;
import co.com.sofka.racehorse.domain.generic.EventChange;

import java.util.HashSet;

public class GameEventChange implements EventChange {

    public GameEventChange(Game game){

        listener((GameCreated event)->{
            game.isPlaying = false;
            game.track = null;
            game.players = new HashSet<>();
            game.podium = new Podium();
            game.winningAward = event.getWinningAward();
        });

        listener((TrackAssigned event)->{
            game.track = new Track(event.getTrackId(),event.getKilometers(),event.getLaneId());
        });


        /*listener((PlayerAssigned event)->{
            if(!game.isPlaying){
                game.players.add(new Player(event.getPlayerId(),event.getName(),event.getLevelPlayer()));
            }else{
                throw  new IllegalArgumentException("No se puede asignar un jugador con el juego en marcha");
            }
        });*/

        /*listener((GameFinished event)->{
            game.isPlaying = false;
        });

        listener((GameStarted event)->{
            game.isPlaying = true;
        });*/

    }

}