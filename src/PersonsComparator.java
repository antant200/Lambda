import java.util.Comparator;

public class PersonsComparator implements Comparator<Person> {
    private int maxSurnameLength;

    public PersonsComparator(int maxSurnameLength) {
        this.maxSurnameLength = maxSurnameLength;
    }

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.surname.compareTo(o2.surname) > 0 && o1.surname.length() <= maxSurnameLength) {
            return 1;
        } else if (o1.surname.compareTo(o2.surname) < 0 && o2.surname.length() <= maxSurnameLength) {
            return -1;
        } else {
            return Integer.compare(o1.age, o2.age);
        }
    }
}