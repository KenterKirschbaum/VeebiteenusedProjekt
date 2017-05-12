/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee.ttu.idu0075.movie;

import ee.ttu.idu0075._2017.ws.movie.AddGenreRequest;
import ee.ttu.idu0075._2017.ws.movie.AddgenreMoviesRequest;
import ee.ttu.idu0075._2017.ws.movie.GenreMoviesListType;
import ee.ttu.idu0075._2017.ws.movie.GenreMoviesType;
import ee.ttu.idu0075._2017.ws.movie.GenreType;
import ee.ttu.idu0075._2017.ws.movie.GetGenreListRequest;
import ee.ttu.idu0075._2017.ws.movie.GetGenreListResponse;
import ee.ttu.idu0075._2017.ws.movie.GetGenreRequest;
import ee.ttu.idu0075._2017.ws.movie.GetgenreMoviesListRequest;
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
 *
 * @author kente_000
 */

@Path("genres")
public class GenresResource {

    @Context
    private UriInfo context;
    
    public GenresResource() {
    }

    @GET
    @Produces("application/json")
    public GetGenreListResponse getGenreList(@QueryParam("token") String token) {
        MovieWebService ws = new MovieWebService();
        GetGenreListRequest request = new GetGenreListRequest();
        request.setToken(token);
        return ws.getGenreList(request);
    }
    
    @GET
    @Path("{id : \\d+}") //supports digits only
    @Produces("application/json")
    public GenreType getGenre(@PathParam("id") String id,
                              @QueryParam("token") String token) {
        MovieWebService ws = new MovieWebService();
        GetGenreRequest request = new GetGenreRequest();
        request.setId(BigInteger.valueOf(Integer.parseInt(id)));
        request.setToken(token);
        return ws.getGenre(request);
    }
    
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public GenreType addGenre(GenreType content, 
                              @QueryParam("token") String token) {
        MovieWebService ws = new MovieWebService();
        AddGenreRequest request = new AddGenreRequest();
        request.setGenreName(content.getGenreName());
        request.setDescription(content.getDescription());
        request.setToken(token);
        return ws.addGenre(request);
    }
    
    @GET
    @Path("{id : \\d+}/movies")
    @Produces("application/json")
    public GenreMoviesListType getgenreMoviesList(@PathParam("id") Integer id, 
                                                  @QueryParam("token") String token) {
        MovieWebService ws = new MovieWebService();
        GetgenreMoviesListRequest request = new GetgenreMoviesListRequest();
        request.setGenreId(BigInteger.valueOf(id));
        request.setToken(token);
        return ws.getgenreMoviesList(request);
    }
    
    @POST
    @Path("{genreId : \\d+}/movies/{movieId : \\d+}")
    @Consumes("application/json")
    @Produces("application/json")
    public GenreMoviesType addgenreMovies(GenreMoviesType content, 
                                          @QueryParam("token") String token, 
                                          @PathParam("genreId") Integer genreId,
                                          @PathParam("movieId") Integer movieId) {
        MovieWebService ws = new MovieWebService();
        AddgenreMoviesRequest request = new AddgenreMoviesRequest();
        request.setToken(token);
        request.setGenreId(BigInteger.valueOf(genreId));
        request.setMovieId(BigInteger.valueOf(movieId));
        return ws.addgenreMovies(request);    
    }
}

