package examples.rest.helloworld;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Project: rest-example
 * Package Name: examples.rest.helloworld
 * Created by: krganeshrajhan
 * Description:
 */
@Path("/hello")
public class HelloWorldService {

    @GET
    @Path("/")
    public Response getMsg() {

        String output = "Hello  ";

        return Response.status(200).entity(output).build();

    }

    @GET
    @Path("/{param}")
    public Response getMsg(@PathParam("param") String msg) {

        String output = "Hello  " + msg;

        return Response.status(200).entity(output).build();

    }
}
