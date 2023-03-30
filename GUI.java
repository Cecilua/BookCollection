import ecs100.*; 
/**
 * Write a description of class GUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GUI
{
    // instance variables - replace the example below with your own
    private Books books;

    /**
     * Constructor for objects of class GUI
     */
    public GUI()
    {
        // initialise instance variables
        books = new Books();
        UI.initialise();
        UI.addButton("Add", this::addBook);
        UI.addButton("quit", UI::quit);
    }
    
    /**
     * add book to collection
     */
    public void addImage(){
        
        String imgFileName = UIFileChooser.open("choose image file: ");
    
    }
    
    /**
     * Add book to collection
     * 
     */
    public void addBook() {
        final int MAX_QUANTITY = 999;
        
        // Ask the user for details
        String ttl = UI.askString("title: ");
        String auth = UI.askString("author: ");
        String gnr = UI.askString("genre: ");
        
        
        int publish = UI.askInt("year published: ");     // this requires validation
        int pgs = UI.askInt("no. pages: ");     // this requires validation
        
        // add a book image for display in GUI
        String img = UIFileChooser.open("Choose Image File: ");
        
        books.addBook(ttl, auth, gnr, publish, pgs, img);
    }
    
}
