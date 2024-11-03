import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {

    static Map<String, String> phoneBook = new TreeMap<>();

    public static int add(String name, String num) {
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, num);
        }
        return phoneBook.size();
    }

    public static String findByNumber(String num) {
        return null;
    }
}
