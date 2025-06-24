package lk.jiat.web.rest;

import jakarta.ejb.Singleton;
import jakarta.json.JsonObject;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriInfo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Path("/users")
public class UserResource {

    @GET
    @Path("/{id}")

    @Produces(MediaType.APPLICATION_JSON)
    public Response getUser(@PathParam("id") Integer id) {

        Map <String,String> map = new HashMap<>();
        map.put("id",String.valueOf(id));
        map.put("name","Vihanga");
        map.put("email","vihanga@gmail.com");



        return Response.serverError().entity(map).build();

    }




}
