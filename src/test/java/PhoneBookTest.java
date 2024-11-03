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

    @Test
    public void testFindByNumber() {
        PhoneBook.add("Petya", "89260000000");
        assertEquals("Petya", PhoneBook.findByNumber("89260000000"));
    }

    @Test
    public void testFindByNumberNotFind() {
        PhoneBook.add("Petya", "89260000000");
        assertEquals("No name", PhoneBook.findByNumber("89260000001"));
    }

    @Test
    public void testFindByName() {
        PhoneBook.add("Petya", "89260000000");
        assertEquals("89260000000", PhoneBook.findByName("Petya"));
    }

    @Test
    public void testFindByNameNotFind() {
        PhoneBook.add("Petya", "89260000000");
        assertEquals("No phone", PhoneBook.findByName("Olya"));
    }
}