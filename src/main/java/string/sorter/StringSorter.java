package string.sorter;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StringSorter {

    public List<String> sortStrings(List<String> unsortedStrings, String exceptionChar) {
        if (unsortedStrings.isEmpty()) {
            return unsortedStrings;
        }
        return Stream.concat(unsortedStrings.stream()
                                            .filter(word -> !word.startsWith(exceptionChar))
                                            .sorted(),
                            unsortedStrings.stream()
                                       .filter(str -> str.startsWith(exceptionChar))
                                       .sorted(Collections.reverseOrder()))
                    .toList();
    }
}
