import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    //instance variables
   private Library library;
   private Book aPromisedLand;
   private Book nineteenEightyFour;

    @Before
    public void before(){
    library = new Library(1);
    aPromisedLand = new Book("A Promised Land", "Barack Obama", "Autobiography");
    nineteenEightyFour = new Book("1984", "George Orwell", "Dystopian Fiction");
    }

    @Test
    public void numberOfBooksInLibrary(){
        assertEquals(0, library.countBooks());
    }

    @Test
    public void addBookToLibrary(){
        library.addBook(aPromisedLand);
        assertEquals(1, library.countBooks());
    }


    @Test
    public void removeBookFromLibrary(){
        library.addBook(nineteenEightyFour);
        library.removeBook(nineteenEightyFour);
        assertEquals(0, library.countBooks());
    }

    @Test
    public void checkIfStockIsFull(){
        library.addBook(aPromisedLand);
        library.addBook(nineteenEightyFour);
        assertEquals(1, library.countBooks());
    }

//    @Test
//    public void canCheckBookOut(){
//        Book checkOut = library.lendBook(aPromisedLand);
//        assertEquals(book, checkOut);
//        assertEquals(1, library.countBooks());
//    }
}
