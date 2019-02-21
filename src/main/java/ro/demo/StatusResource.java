package ro.demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import java.util.logging.Logger;

@Path("status")
public class StatusResource {
  @GET
  @Path("ping")
  public Response check(){
    Logger.getLogger( getClass().getName() ).info("ping");
    return Response.ok().entity("pong back").build();
  }
}
