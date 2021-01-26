import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> booksBorrowed;

    public Borrower(){
        this.booksBorrowed = new ArrayList<Book>();
    }

    public int countBooksBorrowed(){
       return this.booksBorrowed.size();
    }

    public void addBookToBorrowedBooks(Book book){
        this.booksBorrowed.add(book);
    }
}

