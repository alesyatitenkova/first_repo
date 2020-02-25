import java.util.ArrayList;
import java.util.List;

public class FInterfaceExample {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John", 22));
        persons.add(new Person("Stieve", 31));
        persons.add(new Person("Paule", 17));
        persons.add(new Person("Mike", 24));
        persons.add(new Person("Shaun", 15));
        persons.add(new Person("Shane", 16));
        persons.add(new Person("Olha", 16));
        persons.add(new Person("Boris", 45));

        ThreeFunction<Person, Person, Person, String> weddingFunction = (p1, p2, dominator) ->
                new Person("Song of " + p1.getName() + " and " + p2.getName() + " initiated by " + dominator, 0);
        System.out.println(weddingFunction.apply(persons.get(7), persons.get(5), "woman"));

        ThreeFunction<String, Long, Long, String> calculator = (a, b, operationResult) -> operationResult + (a + b);
        System.out.println(calculator.apply(1L, 2L, "Result of summ 1 and 2 is = "));
    }
}
