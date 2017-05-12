/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee.ttu.idu0075.movie;

import ee.ttu.idu0075._2017.ws.movie.AddGenreRequest;
import ee.ttu.idu0075._2017.ws.movie.AddMovieRequest;
import ee.ttu.idu0075._2017.ws.movie.AddgenreMoviesRequest;
import ee.ttu.idu0075._2017.ws.movie.GenreMoviesListType;
import ee.ttu.idu0075._2017.ws.movie.GenreMoviesType;
import ee.ttu.idu0075._2017.ws.movie.GenreType;
import ee.ttu.idu0075._2017.ws.movie.GetGenreListRequest;
import ee.ttu.idu0075._2017.ws.movie.GetGenreListResponse;
import ee.ttu.idu0075._2017.ws.movie.GetGenreRequest;
import ee.ttu.idu0075._2017.ws.movie.GetMovieListRequest;
import ee.ttu.idu0075._2017.ws.movie.GetMovieListResponse;
import ee.ttu.idu0075._2017.ws.movie.GetMovieRequest;
import ee.ttu.idu0075._2017.ws.movie.GetgenreMoviesListRequest;
import ee.ttu.idu0075._2017.ws.movie.MovieType;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;

/**
 *
 * @author kente_000
 */
@WebService(serviceName = "MovieService", portName = "MoviePort", endpointInterface = "ee.ttu.idu0075._2017.ws.movie.MoviePortType", targetNamespace = "http://www.ttu.ee/idu0075/2017/ws/movie", wsdlLocation = "WEB-INF/wsdl/MovieWebService/MovieService.wsdl")
public class MovieWebService {

    static int nextMovieId = 1;
    static int nextGenreId = 1;
    static List<GenreType> genreList = new ArrayList<GenreType>();
    static List<MovieType> movieList = new ArrayList<MovieType>();
    
    public MovieType getMovie(GetMovieRequest parameter) {
        MovieType mt = null;
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            for (int i = 0; i < movieList.size(); i++) {
                if (movieList.get(i).getId().equals(parameter.getId())) {
                    mt = movieList.get(i);
                }
            }
        }
        return mt;
    }

    public MovieType addMovie(AddMovieRequest parameter) {
        MovieType mt = new MovieType();
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            mt.setName(parameter.getName());
            mt.setActors(parameter.getActors());
            mt.setDirector(mt.getDirector());
            mt.setReleaseYear(parameter.getReleaseYear());
            mt.setId(BigInteger.valueOf(nextMovieId++));
            movieList.add(mt);
        }
        return mt;
    }

    public GetMovieListResponse getMovieList(GetMovieListRequest parameter) {
        GetMovieListResponse response = new GetMovieListResponse();
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            for (MovieType movieType : movieList) {
                if (parameter.getName().equalsIgnoreCase(movieType.getName()) &&
                        parameter.getReleaseYear().equals(movieType.getReleaseYear())) {
                   response.getMovie().add(movieType); 
                }
            }
        }
        return response;
    }

    public GenreType getGenre(GetGenreRequest parameter) {
        GenreType gt = null;
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            for (int i = 0; i < genreList.size(); i++) {
                if (genreList.get(i).getId().equals(parameter.getId())) {
                    gt = genreList.get(i);
                }
            }
        }
        return gt;
    }

    public GenreType addGenre(AddGenreRequest parameter) {
        GenreType gt = new GenreType();
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            if (parameter.getGenreName().equalsIgnoreCase("Action") ||
                parameter.getGenreName().equalsIgnoreCase("Horror") ||
                parameter.getGenreName().equalsIgnoreCase("Comedy")) {
            
            gt.setId(BigInteger.valueOf(nextGenreId++));
            gt.setGenreName(parameter.getGenreName());
            genreList.add(gt);
            }
        }
        return gt;
    }


    public GetGenreListResponse getGenreList(GetGenreListRequest parameter) {
        GetGenreListResponse response = new GetGenreListResponse();
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            for (GenreType genreType : genreList) {
                response.getGenre().add(genreType);
            }
        }
        return response;
    }

    public GenreMoviesListType getgenreMoviesList(GetgenreMoviesListRequest parameter) {
        GenreMoviesListType genreMoviesList = null;
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            for (int i = 0; i < genreList.size(); i++) {
                if (genreList.get(i).getId().equals(parameter.getGenreId())) {
                    genreMoviesList = genreList.get(i).getGenreMoviesList();
                }
            }    
        }
        return genreMoviesList;
    }


    public GenreMoviesType addgenreMovies(AddgenreMoviesRequest parameter) {
       GenreMoviesType genreMovie = new GenreMoviesType();
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            GetMovieRequest movieRequest = new GetMovieRequest();
            movieRequest.setId(parameter.getMovieId());
            movieRequest.setToken(parameter.getToken());
            genreMovie.setMovie(getMovie(movieRequest));
        }
        for (int i = 0; i < genreList.size(); i++) {
            if (genreList.get(i).getId().equals(parameter.getGenreId())) {
                genreList.get(i).getGenreMoviesList().getGenreMovies().add(genreMovie);
                return genreMovie;
            }
        }
    return null;
    }
}





