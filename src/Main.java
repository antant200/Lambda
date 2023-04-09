import java.util.ArrayList;
import java.util.Comparator;
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
        int maxSurnameLength = 6;
        Comparator<Person> comparator = (Person p1, Person p2) -> {
            if ((p1.surname.compareTo(p2.surname) > 0) && (p1.surname.length() <= maxSurnameLength)) {
                return 1;
            } else if ((p2.surname.compareTo(p1.surname) > 0) && (p2.surname.length() <= maxSurnameLength)) {
                return -1;
            } else {
                return Integer.compare(p1.age, p2.age);
            }
        };
        System.out.println("До изменения: ");
        System.out.println(persons);
        System.out.println("С максимальной длиной: " + maxSurnameLength);
        persons.sort(comparator);
        System.out.println(persons);
    }
}