package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/g")
    public String getHello() {
        return "Hello RESTEasy";
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/p")
    public String postHello() {
        return "Hello RESTEasy";
    }
}
