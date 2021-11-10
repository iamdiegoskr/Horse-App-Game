package co.com.sofka.racehorse.infra.entrypoint;


import co.com.sofka.racehorse.domain.game.command.AddPlayerCommand;
import co.com.sofka.racehorse.domain.game.command.AddTrackCommand;
import co.com.sofka.racehorse.domain.game.command.CreateGameCommand;
import io.vertx.mutiny.core.eventbus.EventBus;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/api")
public class CommandController {

    private final EventBus bus;

    public CommandController(EventBus bus){
        this.bus = bus;
    }

    /*@POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/assignScore")
    public Response executor(AssignScoreCommand command) {
        bus.publish(command.getType(), command);
        return Response.ok().build();
    }*/

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/createGame")
    public Response executor(CreateGameCommand command) {
        bus.publish(command.getType(), command);//emitir comandos, los casos de uso
        return Response.ok().build();
    }


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/addTrack")
    public Response executor(AddTrackCommand command) {
        bus.publish(command.getType(), command);
        return Response.ok().build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/addPlayer")
    public Response executor(AddPlayerCommand command) {
        bus.publish(command.getType(), command);
        return Response.ok().build();
    }

}