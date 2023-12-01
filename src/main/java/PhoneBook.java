import java.util.*;

public class PhoneBook {
    static HashMap<String, Long> phoneBook = new HashMap<>();

    public void phoneBook() {
        PhoneBook.phoneBook.put("TestName", 9999999999L);
    }

    public static int add(String name, long number) {
        phoneBook.put(name, number);
        return phoneBook.size();
    }

    public static String findByNumber(long number) {
        Optional<String> result = phoneBook.entrySet().stream()
                .filter(n -> n.getValue().equals(number))
                .map(Map.Entry::getKey)
                .findFirst();

        return result.orElse("");
    }

    public static long findByName(String name) {
        return 0;
    }

}
