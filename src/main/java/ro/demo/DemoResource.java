package ro.demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import java.util.logging.Logger;

@Path("demo")
public class DemoResource {
  @GET
  @Path("echo")
  public String echo(@QueryParam("message") final String message){
    final String messageOrDefault = message==null || message.length()==0 ? "Default message!" : message;
    Logger.getLogger( getClass().getName() ).info(String.format("received message: %s", message));
    return System.lineSeparator() + messageOrDefault + " back";
  }
}
