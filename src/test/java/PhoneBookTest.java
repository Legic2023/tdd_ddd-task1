import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {

    @RepeatedTest(2) // вторым повторением теста проверяем на отсутствие дублирования имени в книге
    public void testAdd_result() {
        // given:
        final String name = "TestName";
        final long number = 9999999999L;
        final int original = 1;
        // when:
        final int result = PhoneBook.add(name, number);
        // then:
        assertEquals(original, result);
    }

    @Test
    public void testFindByNumber() {
        // given:
        final String original = "TestName";
        final long number = 9999999999L;
        // when:
        PhoneBook.phoneBook.put("TestName", 9999999999L);
        final String result = PhoneBook.findByNumber(number);
        // then:
        assertEquals(original, result);

    }

    @Test
    public void testFindByName() {
        // given:
        final String name = "TestName";
        final long original = 9999999999L;
        // when:
        final long result = PhoneBook.findByName(name);
        // then:
        assertEquals(original, result);

    }

}
