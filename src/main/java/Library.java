import java.util.ArrayList;

public class Library {

    private ArrayList<Book> bookCollection;
    private int capacity;

    public Library(int capacity){
        this.bookCollection = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int countBooks() {
        return this.bookCollection.size();
    }

    public void addBook(Book book) {
        if (countBooks() < this.capacity) {
            bookCollection.add(book);
        }
    }

    public void removeBook(Book book) {
        bookCollection.remove(book);
    }

//    public Book lendBook(Book book) {
//
//    }
}
