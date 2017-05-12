
package ee.ttu.idu0075._2017.ws.movie;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ee.ttu.idu0075._2017.ws.movie package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddMovieResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2017/ws/movie", "addMovieResponse");
    private final static QName _AddgenreMoviesResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2017/ws/movie", "addgenreMoviesResponse");
    private final static QName _GetMovieResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2017/ws/movie", "getMovieResponse");
    private final static QName _GetgenreMoviesListResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2017/ws/movie", "getgenreMoviesListResponse");
    private final static QName _GetGenreResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2017/ws/movie", "getGenreResponse");
    private final static QName _AddGenreResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2017/ws/movie", "addGenreResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ee.ttu.idu0075._2017.ws.movie
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMovieListRequest }
     * 
     */
    public GetMovieListRequest createGetMovieListRequest() {
        return new GetMovieListRequest();
    }

    /**
     * Create an instance of {@link GetGenreListRequest }
     * 
     */
    public GetGenreListRequest createGetGenreListRequest() {
        return new GetGenreListRequest();
    }

    /**
     * Create an instance of {@link GetgenreMoviesListRequest }
     * 
     */
    public GetgenreMoviesListRequest createGetgenreMoviesListRequest() {
        return new GetgenreMoviesListRequest();
    }

    /**
     * Create an instance of {@link GenreMoviesListType }
     * 
     */
    public GenreMoviesListType createGenreMoviesListType() {
        return new GenreMoviesListType();
    }

    /**
     * Create an instance of {@link GetGenreRequest }
     * 
     */
    public GetGenreRequest createGetGenreRequest() {
        return new GetGenreRequest();
    }

    /**
     * Create an instance of {@link MovieType }
     * 
     */
    public MovieType createMovieType() {
        return new MovieType();
    }

    /**
     * Create an instance of {@link AddMovieRequest }
     * 
     */
    public AddMovieRequest createAddMovieRequest() {
        return new AddMovieRequest();
    }

    /**
     * Create an instance of {@link GetMovieListResponse }
     * 
     */
    public GetMovieListResponse createGetMovieListResponse() {
        return new GetMovieListResponse();
    }

    /**
     * Create an instance of {@link GenreType }
     * 
     */
    public GenreType createGenreType() {
        return new GenreType();
    }

    /**
     * Create an instance of {@link AddgenreMoviesRequest }
     * 
     */
    public AddgenreMoviesRequest createAddgenreMoviesRequest() {
        return new AddgenreMoviesRequest();
    }

    /**
     * Create an instance of {@link AddGenreRequest }
     * 
     */
    public AddGenreRequest createAddGenreRequest() {
        return new AddGenreRequest();
    }

    /**
     * Create an instance of {@link GenreMoviesType }
     * 
     */
    public GenreMoviesType createGenreMoviesType() {
        return new GenreMoviesType();
    }

    /**
     * Create an instance of {@link GetMovieRequest }
     * 
     */
    public GetMovieRequest createGetMovieRequest() {
        return new GetMovieRequest();
    }

    /**
     * Create an instance of {@link GetGenreListResponse }
     * 
     */
    public GetGenreListResponse createGetGenreListResponse() {
        return new GetGenreListResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MovieType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2017/ws/movie", name = "addMovieResponse")
    public JAXBElement<MovieType> createAddMovieResponse(MovieType value) {
        return new JAXBElement<MovieType>(_AddMovieResponse_QNAME, MovieType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenreMoviesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2017/ws/movie", name = "addgenreMoviesResponse")
    public JAXBElement<GenreMoviesType> createAddgenreMoviesResponse(GenreMoviesType value) {
        return new JAXBElement<GenreMoviesType>(_AddgenreMoviesResponse_QNAME, GenreMoviesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MovieType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2017/ws/movie", name = "getMovieResponse")
    public JAXBElement<MovieType> createGetMovieResponse(MovieType value) {
        return new JAXBElement<MovieType>(_GetMovieResponse_QNAME, MovieType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenreMoviesListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2017/ws/movie", name = "getgenreMoviesListResponse")
    public JAXBElement<GenreMoviesListType> createGetgenreMoviesListResponse(GenreMoviesListType value) {
        return new JAXBElement<GenreMoviesListType>(_GetgenreMoviesListResponse_QNAME, GenreMoviesListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenreType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2017/ws/movie", name = "getGenreResponse")
    public JAXBElement<GenreType> createGetGenreResponse(GenreType value) {
        return new JAXBElement<GenreType>(_GetGenreResponse_QNAME, GenreType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenreType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2017/ws/movie", name = "addGenreResponse")
    public JAXBElement<GenreType> createAddGenreResponse(GenreType value) {
        return new JAXBElement<GenreType>(_AddGenreResponse_QNAME, GenreType.class, null, value);
    }

}
