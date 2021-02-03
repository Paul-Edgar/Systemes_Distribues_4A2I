package fr.polytech.TPRest.Servlet;

import fr.polytech.TPRest.Servlet.DBManager.PokemonManager;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.*;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.NewCookie;
import javax.ws.rs.core.Response;

@Path("/API")
public class HelloServlet extends HttpServlet
{
    @GET
    @Path("sayHello")
    public String sayHello()
    {
        return "hello";
    }

    @POST
    @Path("post")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addPerson(Person person)
    {
        return Response.ok().entity(person).cookie(new NewCookie("person", person.toString())).build();
    }

    @GET
    @Path("get")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPerson(){
        Person perso1 = new Person("Lulu" , "Cuoco");
        return Response.ok().entity(perso1).build();
    }

    @PUT
    @Path("put")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response putPerson(Person person)
    {
        return Response.ok().entity(person).cookie(new NewCookie("person", person.toString())).build();
    }

    @DELETE
    @Path("delete")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response delPerson(Person person)
    {
        return Response.ok().entity(person).cookie(new NewCookie("person", person.toString())).build();
    }


    // Pokemon

    private static List<Pokemon> pokemons;
    static
    {
        pokemons = new ArrayList<>();
        pokemons.add(new Pokemon(1, "Gengar", 100));
        pokemons.add(new Pokemon(2, "Charizard", 85));
        pokemons.add(new Pokemon(3, "Mudkip", 15));
    }

    @GET
    @Path("/Pokemon")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public List<Pokemon> getPokemon() {
        PokemonManager pm = new PokemonManager();
        return pm.getAll();
    }

    @POST
    @Path("/Pokemon")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addPokemon(Pokemon pokemon)
    {
        PokemonManager pm = new PokemonManager();
        return Response.ok().entity(pokemon).build();
    }

    // PUT

    @DELETE
    @Path("supprimerpokemon/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Pokemon deletePokemon(@PathParam("id") int id)
    {
        Pokemon pokemon = new Pokemon();
        for(int i=0; i<pokemons.size();i++)
        {
            if(id==pokemons.get(i).getId())
            {
                pokemon = pokemons.get(i);
                pokemons.remove(i);
            }
        }
        return pokemon;
    }
}