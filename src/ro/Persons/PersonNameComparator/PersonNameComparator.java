package ro.Persons.PersonNameComparator;

import java.util.Comparator;
import ro.Persons.Person.Person;

public class PersonNameComparator implements Comparator<Person> {
  public PersonNameComparator() {}

  public int compare(Person o1, Person o2) {
    return o1.getName().compareTo(o2.getName());
  }
}
