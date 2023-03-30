
/**
 * support class Book
 * book has an title, author, genre, publishing year, no. pages, and a cover  
 *
 * @author CC
 * @version 30/03/23
 */
public class Book
{
    // instance variables - replace the example below with your own
    
    private String title;
    private String author;
    private String genre;
    private int published; 
    private int pages;
    private String image;
    private static final String DEFAULTIMG = "default_book_cover.jpeg";

    /**
     * Constructor for objects of class Book
     */
    public Book(String ttl, String auth, String gnr, int publish, int pgs, String img)
    {
        // initialise instance variables
        this.title = ttl;
        this.author = auth;
        this.genre = gnr;
        this.published = publish;
        this.pages = pgs;
        if (img == null) {
            this.image = DEFAULTIMG;
        } else {
            this.image = img;
        }
    }
    
    /**
     * Constructor for objects of class Book
     */
    public Book(String ttl, String auth, String gnr, int publish, int pgs)
    {
        // initialise instance variables       
        this(ttl, auth, gnr, publish, pgs, DEFAULTIMG);
    }
}
