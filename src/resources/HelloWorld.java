package resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloWorld {
       
    @Path("{conteudo}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response helloworld(@PathParam("conteudo") String conteudo) {
        return Response.status(200).entity(conteudo).build();
    }
    
}
