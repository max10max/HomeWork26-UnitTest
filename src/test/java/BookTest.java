import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Stack;

public class BookTest {
    Book bookTest;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Tests start");
    }

    @BeforeEach
    public void BeforeEach() {
        bookTest = new Book("testName", new Author(null, null), 2023);
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Tests end");
    }


    @Test
    public void upTest() {
        int result = bookTest.rating + 1;
        bookTest.up();
        Assertions.assertEquals(bookTest.rating, result);

    }

    @Test
    public void downTest() {
        int result = bookTest.rating - 1;
        bookTest.down();
        Assertions.assertEquals(bookTest.rating, result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"test1", "test2"})
    public void appendTest(String i) {
        bookTest.append(i);
        Assertions.assertEquals(bookTest.textBook, " " + i);
    }

}
