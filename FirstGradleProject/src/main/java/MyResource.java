import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/api")
public class MyResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/status")
    public Response getServerStatus() {
        return Response.status(200).entity("Server Running").build();
    }
}
