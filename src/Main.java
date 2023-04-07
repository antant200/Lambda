import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
        Collections.sort(persons, new PersonsComparator(7));
        System.out.println(persons);
        Collections.sort(persons, new PersonsComparator(100)); //Если бы не было максимальной длины
        System.out.println(persons);

    }
}