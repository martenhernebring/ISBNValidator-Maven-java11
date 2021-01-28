package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BookTest {

	//G
	@Test
	public void test2EqualBooks() {
	    Book cleanAgile1 = new Book(2019945397, "Clean Agile", "Robert C. Martin", "978-0-13-578186-9", "LoCCN", 205);
	    Book cleanAgile2 = new Book(2019945397, "Clean Agile", "Robert C. Martin", "0-13-578186-8", "LoCCN", 205);
	    assertEquals(cleanAgile1, cleanAgile2);
	}

	//G
	@Test
	public void test2NonEqualBooks() {
	    Book cleanAgile = new Book(2019945397, "Clean Agile", "Robert C. Martin", "978-0-13-578186-9", "LoCCN", 205);
        Book verseBook = new Book(86233680, "A book of courtly cats, with verses", "William Shakespeare", "0-80-500156-5", "LoCCN", 48);
        assertNotEquals(cleanAgile, verseBook);
	}

}
