import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before(){
        book = new Book("The Boy, The Mole, The Fox and The Horse",
                "Charlie Mackesy",
                "Humour, Mind&Body");
    }

    @Test
    public void bookHasTitle(){
        assertEquals("The Boy, The Mole, The Fox and The Horse", book.getTitle());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("Charlie Mackesy", book.getAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Humour, Mind&Body",  book.getGenre());
    }
}
