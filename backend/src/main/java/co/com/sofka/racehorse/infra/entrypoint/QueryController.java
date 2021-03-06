package co.com.sofka.racehorse.infra.entrypoint;

import co.com.sofka.racehorse.domain.game.values.GameId;
import com.mongodb.client.MongoClient;
import com.mongodb.client.model.Filters;
import org.bson.Document;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/api")
public class QueryController {
    private final MongoClient mongoClient;

    public QueryController(MongoClient mongoClient) {
        this.mongoClient = mongoClient;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/game/{id}")
    public Response get(@PathParam("id") GameId gameId) {
        List<Document> documentList = new ArrayList<>();
        mongoClient.getDatabase("queries")
                .getCollection("game")
                .find(Filters.eq("_id", gameId))
                .forEach(documentList::add);
        return Response.ok(documentList).build();
    }
}
