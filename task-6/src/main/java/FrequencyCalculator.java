import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencyCalculator {
    static String text =  "China Australia India USA USSR UK China France Poland Austria India USA Egypt China";
    /*static String[] COUNTRY_NAMES
            = { "China", "Australia", "India", "USA", "USSR", "UK", "China",
            "France", "Poland", "Austria", "India", "USA", "Egypt", "China" };*/

    public static void main(String[] arg) {
        // https://www.baeldung.com/java-word-frequency
        Map<String, Long> counterMap = new HashMap<>();
        Stream.of(text.split(" "))
                .collect(Collectors.groupingBy(k -> k, ()-> counterMap,
                        Collectors.counting()));
        System.out.println(counterMap);
    }
}