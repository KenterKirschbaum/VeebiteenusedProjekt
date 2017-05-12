/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviejavaapplication;

import ee.ttu.idu0075._2017.ws.movie.AddMovieRequest;
import ee.ttu.idu0075._2017.ws.movie.GetMovieRequest;
import ee.ttu.idu0075._2017.ws.movie.MoviePortType;
import ee.ttu.idu0075._2017.ws.movie.MovieService;
import ee.ttu.idu0075._2017.ws.movie.MovieType;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author kente_000
 */
public class MovieJavaApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ADD
        AddMovieRequest amr = new AddMovieRequest();
        amr.setActors("Madis");
        amr.setDirector("Ulk");
        amr.setName("Film1");
        amr.setReleaseYear(BigInteger.valueOf(2014));
        amr.setToken("salajane");
        addMovie(amr);
        
        //GET
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the movie ID: ");
        BigInteger id = scanner.nextBigInteger();
        System.out.println(id);
        GetMovieRequest gmr = new GetMovieRequest();
        gmr.setToken("salajane");
        gmr.setId(id);
        System.out.println(getMovie(gmr));
    }


    private static MovieType addMovie(AddMovieRequest parameter) {
        MovieService service = new MovieService();
        MoviePortType port = service.getMoviePort();
        return port.addMovie(parameter);
    }

    private static MovieType getMovie(GetMovieRequest parameter) {
        MovieService service = new MovieService();
        MoviePortType port = service.getMoviePort();
        return port.getMovie(parameter);
    }
    
}
