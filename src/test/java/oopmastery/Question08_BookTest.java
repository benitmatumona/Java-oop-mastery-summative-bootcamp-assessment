package oopmastery;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question08_BookTest {

    @Test
    void newBookShouldNotBeBorrowed() {

        Question08_Book book =
                new Question08_Book(
                        "Clean Code"
                );

        assertFalse(
                book.isBorrowed()
        );
    }

    @Test
    void shouldBorrowBook() {

        Question08_Book book =
                new Question08_Book(
                        "Clean Code"
                );

        book.borrow();

        assertTrue(
                book.isBorrowed()
        );
    }

    @Test
    void shouldReturnBook() {

        Question08_Book book =
                new Question08_Book(
                        "Clean Code"
                );

        book.borrow();
        book.returnBook();

        assertFalse(
                book.isBorrowed()
        );
    }

    @Test
    void borrowingTwiceShouldHaveNoEffect() {

        Question08_Book book =
                new Question08_Book(
                        "Clean Code"
                );

        book.borrow();
        book.borrow();

        assertTrue(
                book.isBorrowed()
        );
    }

    @Test
    void shouldReturnTitle() {

        Question08_Book book =
                new Question08_Book(
                        "Clean Code"
                );

        assertEquals(
                "Clean Code",
                book.getTitle()
        );
    }
}