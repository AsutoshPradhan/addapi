package test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

//return addition use: http://localhost:8080/javaap2/rest/test/3/2

@Path("/test")
public class add {

	@GET
	@Path("{id1}/{id2}")
	//@Produces(MediaType.APPLICATION_XML) 
	public Response getUserById(@PathParam("id1") int id1,@PathParam("id2") int id2 ) {

	   return Response.status(200).entity( id1+id2).build();

	}

	
	
// for web.xml = <param-value>pkge name</param-value> 	
   // <display-name>project name</display-name>  		
    		
    }


