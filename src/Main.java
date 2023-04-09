import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        Person person1 = new Person("Anton", "Markelov", 21);
        Person person2 = new Person("Yulia", "Markidonova", 14);
        Person person3 = new Person("Timiti", "Balaev", 15);
        Person person4 = new Person("Timoti", "Balaev", 25);
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        Predicate<Person> personPredicate = (Person p1) -> {
            if (p1.age < 18) {
                return true;
            } else {
                return false;
            }
        };
        System.out.println("До изменений:");
        System.out.println(persons);
        persons.removeIf(personPredicate);
        System.out.println("После изменений:");
        System.out.println(persons);
    }
}
