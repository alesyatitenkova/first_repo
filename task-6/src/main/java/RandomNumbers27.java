import java.util.*;
import java.util.stream.Collectors;

public class RandomNumbers27 {

    public static void main(String[] args) {
        List<Integer> numbersList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int random = (int) (Math.random() * 20);
            numbersList.add(random);
        }
        System.out.println(numbersList);

        Set<Integer> numbersSet = new HashSet<>(numbersList);
        System.out.println(numbersSet);

        System.out.println(numbersList.stream().distinct().collect(Collectors.toList()));
    }
}