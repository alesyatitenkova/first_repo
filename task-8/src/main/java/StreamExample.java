import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamExample {

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
        persons.forEach(System.out::println);
        System.out.println("After creation");

        Comparator<Person> nameComparator = Comparator.comparing(Person::getName);
        Comparator<Person> ageComparator = Comparator.comparing(Person::getAge);

        persons.stream().sorted(nameComparator).peek(System.out::println).sorted(ageComparator).forEach(System.out::println);
    }
}
