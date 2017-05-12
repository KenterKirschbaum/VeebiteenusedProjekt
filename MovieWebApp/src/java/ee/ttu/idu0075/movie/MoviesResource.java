/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee.ttu.idu0075.movie;

import ee.ttu.idu0075._2017.ws.movie.AddMovieRequest;
import ee.ttu.idu0075._2017.ws.movie.GetMovieListRequest;
import ee.ttu.idu0075._2017.ws.movie.GetMovieListResponse;
import ee.ttu.idu0075._2017.ws.movie.GetMovieRequest;
import ee.ttu.idu0075._2017.ws.movie.MovieType;
import java.math.BigInteger;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;


/**
 * REST Web Service
 *
 * @author kente_000
 */
@Path("movies")
public class MoviesResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of MoviesResource
     */
    public MoviesResource() {
    }

    /**
     * Retrieves representation of an instance of ee.ttu.idu0075.movie.MoviesResource
     * @return an instance of ee.ttu.idu0075._2017.ws.movie.MovieType
     */
    @GET
    @Produces("application/json")
    public GetMovieListResponse getMovieList(@QueryParam("token") String token,
                                             @QueryParam("releaseYear") Integer year,
                                             @QueryParam("name") String name) {
        MovieWebService ws = new MovieWebService();
        GetMovieListRequest request = new GetMovieListRequest();
        request.setToken(token);
        request.setName(name);
        request.setReleaseYear(BigInteger.valueOf(year));
        return ws.getMovieList(request);
    }
    
    @GET
    @Path("{id : \\d+}") //supports digits only
    @Produces("application/json")
    public MovieType getMovie(@PathParam("id") String id,
            @QueryParam("token") String token) {
        MovieWebService ws = new MovieWebService();
        GetMovieRequest request = new GetMovieRequest();
        request.setId(BigInteger.valueOf(Integer.parseInt(id)));
        request.setToken(token);
        return ws.getMovie(request);
    }
    
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public MovieType addMovie(MovieType content, 
                                @QueryParam("token") String token) {
        MovieWebService ws = new MovieWebService();
        AddMovieRequest request = new AddMovieRequest();
        request.setActors(content.getActors());
        request.setName(content.getName());
        request.setDirector(content.getDirector());
        request.setReleaseYear(content.getReleaseYear());
        request.setToken(token);
        return ws.addMovie(request);
    }
}
