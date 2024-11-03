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
        if (phoneBook.containsValue(num)) {
            for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
                if (phoneBook.get(entry.getKey()).equals(num)) {
                    return entry.getKey();
                }
            }
        }
        return "No name";
    }

    public static String findByName(String name) {
        if (phoneBook.containsKey(name)) {
            return phoneBook.get(name);
        }
        return "No phone";
    }
}
