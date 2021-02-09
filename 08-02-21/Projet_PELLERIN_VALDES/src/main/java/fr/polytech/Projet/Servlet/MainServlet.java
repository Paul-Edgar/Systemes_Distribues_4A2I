package fr.polytech.Projet.Servlet;

import fr.polytech.Projet.Servlet.DBManager.AnimalManager;

import java.util.List;
import javax.servlet.http.*;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/API")
public class MainServlet extends HttpServlet
{
    @GET
    @Path("/Animal")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public List<Animal> getAnimaux() {
        AnimalManager pm = new AnimalManager();
        return pm.getAll();
    }

    @GET
    @Path("/Animal/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Animal getAnimalById(@PathParam("id") int id)
    {
        AnimalManager pm = new AnimalManager();
        return pm.getById(id);
    }

    @POST
    @Path("/Animal")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addAnimal(Animal animal)
    {
        AnimalManager pm = new AnimalManager();
        return Response.status(Response.Status.CREATED).entity(pm.create(animal)).build();
    }

    @PUT
    @Path("/Animal")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Animal updateAnimal(Animal animal)
    {
        AnimalManager pm = new AnimalManager();
        return pm.update(animal);
    }

    @DELETE
    @Path("/Animal")
    @Consumes(MediaType.APPLICATION_JSON)
    public Animal deleteAnimal(Animal animal)
    {
        AnimalManager pm = new AnimalManager();
        return pm.delete(animal);
    }
}