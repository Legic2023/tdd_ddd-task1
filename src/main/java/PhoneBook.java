import java.util.HashMap;

public class PhoneBook {
    static HashMap<String, Long> phoneBook = new HashMap<>();
    public static int add(String name, long number) {
        phoneBook.put(name, number);
        return phoneBook.size();
    }

    public static String findByNumber(long number) {
        return null;
    }

}
