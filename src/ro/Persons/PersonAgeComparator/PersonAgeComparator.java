package ro.Persons.PersonAgeComparator;

import java.util.Comparator;
import ro.Persons.Person.Person;

public class PersonAgeComparator implements Comparator<Person> {
  public PersonAgeComparator() {}

  public int compare(Person o1, Person o2) {
    return Integer.compare(o1.getAge(), o2.getAge());
  }
}
