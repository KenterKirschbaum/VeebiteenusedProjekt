
package ee.ttu.idu0075._2017.ws.movie;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for genreMoviesListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="genreMoviesListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="genreMovies" type="{http://www.ttu.ee/idu0075/2017/ws/movie}genreMoviesType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "genreMoviesListType", propOrder = {
    "genreMovies"
})
public class GenreMoviesListType {

    protected List<GenreMoviesType> genreMovies;

    /**
     * Gets the value of the genreMovies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genreMovies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenreMovies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenreMoviesType }
     * 
     * 
     */
    public List<GenreMoviesType> getGenreMovies() {
        if (genreMovies == null) {
            genreMovies = new ArrayList<GenreMoviesType>();
        }
        return this.genreMovies;
    }

}
