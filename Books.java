
import java.util.HashMap;
import ecs100.*; 
/**
 * Write a description of class Books here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Books
{
    // instance variables - replace the example below with your own
    private HashMap<Integer, Book> booksMap; // declare hashmap
    private int currBookId;
    
    /**
     * Constructor for objects of class Books
     */
    public Books()
    {
        // initialise instance variables
        booksMap = new HashMap<Integer, Book>();
        
        Book b1 = new Book("1984", "George Orwell", "Dystopian", 1949, 328);
        Book b2 = new Book("Fahrenheit 451", "Ray Bradbury", "Dystopian", 1953, 158);
        Book b3 = new Book("The A.B.C. Murders", "Agatha Christie", "Crime Novel", 1936, 256);
        
        booksMap.put(1, b1);
        booksMap.put(2, b2);
        booksMap.put(3, b3);
        
        
        this.currBookId = 3; 
        
    }
    
    /**
     * add book to hashmap 
     */
    public void addBook(String ttl, String auth, String gnr, int publish, int pgs, String img) {
        currBookId++; // increment book id 
        booksMap.put(currBookId, new Book(ttl, auth, gnr, publish, pgs, img));
    }
    
    /**
     * looks for book in hashmap 
     * @return boolean if found
     */
    public boolean findBook(String title) {
        for (int bookID : booksMap.keySet()) {
            if(booksMap.get(bookID).getTitle().equals(title)) {
                return true;
            }
        }
        
        return false; // if not found
    }

}
