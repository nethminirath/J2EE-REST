package lk.jiat.web.rest;

import jakarta.ws.rs.*;

import java.sql.SQLOutput;

@Path("/")
public class Home {

    //JAX-RS(Specification)
    //Jersey,RESTEasy

    @GET
    public String home(){
        System.out.println("Home");
        return "Hello World";
    }



//    @POST
//    public String post(){
//        return "post";
//    }
//
//    @PUT
//    public String put(){
//        return "put";
//    }
//
//    @DELETE
//    public String delete(){
//        return "delete";
//    }
//
//    @OPTIONS
//    public String options(){
//        return "options";
//    }
//
//    @HEAD
//    public String head(){
//        return "head";
//    }
}
