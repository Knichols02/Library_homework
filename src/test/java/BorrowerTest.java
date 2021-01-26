import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.BrokenBarrierException;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

     Borrower borrowerCollection;
     Book aPromisedLand;
     Book nineteenEightyFour;
     Library library;

    @Before
    public void before(){
        borrowerCollection = new Borrower();
        aPromisedLand = new Book("A Promised Land", "Barack Obama", "Autobiography");
        nineteenEightyFour = new Book("1984", "George Orwell", "Dystopian Fiction");
        library = new Library(2);
    }

    @Test
    public void collectionStartsEmpty(){
        assertEquals(0, borrowerCollection.countBooksBorrowed());
    }
    @Test
    public void addBookToBorrowedBooks(){
        borrowerCollection.addBookToBorrowedBooks(aPromisedLand);
        assertEquals(1, borrowerCollection.countBooksBorrowed());
    }

//    @Test
//    public void canBorrowBookFromLibrary(){
//        borrowerCollection.borrowBook(library);
//        assertEquals(1, borrowerCollection.countBooksBorrowed());
//    }

}
