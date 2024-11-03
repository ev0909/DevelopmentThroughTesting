import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {

    @Test
    public void testAdd() {
        int result = PhoneBook.add("Petya", "89260000000") +
                PhoneBook.add("Olya", "89260000001");
        assertEquals(result, 3);
    }

    @Test
    public void testAddName() {
        int result = PhoneBook.add("Petya", "89260000000") +
                PhoneBook.add("Olya", "89260000001")
                + PhoneBook.add("Olya", "89260000001");
        assertEquals(result, 5);
    }
}