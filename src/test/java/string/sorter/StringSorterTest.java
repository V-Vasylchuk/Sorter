package string.sorter;

import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringSorterTest {
    private final StringSorter sorter = new StringSorter();

    @Test
    void sortStringsTestWithPrefixA() {
        List<String> inputList = List.of("apple", "banana", "grape", "avocado", "cherry");
        List<String> expected = List.of("banana", "cherry", "grape", "avocado", "apple");
        List<String> actual = sorter.sortStrings(inputList, "a");
        assertEquals(expected, actual);
    }

    @Test
    public void sortStringsWithEmptyInputList() {
        String exceptionPrefix = "a";

        List<String> input = List.of();
        List<String> expected = List.of();
        List<String> actual = sorter.sortStrings(input, exceptionPrefix);
        assertEquals(expected, actual);
    }
}
