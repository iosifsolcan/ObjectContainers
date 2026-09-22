package ro.Persons.Run;

import java.util.Scanner;
import java.util.TreeSet;

import ro.Persons.Person.Hired.Hired;
import ro.Persons.Person.Person;
import ro.Persons.Person.Hobbies.Hobbies;

public class Run {
  Scanner sc;

  public Run() {
    this.sc = new Scanner(System.in);
  }

  public void runApplication() {
    Person person = new Hired();
    person.addPerson();
    TreeSet<Person> persons = person.getPersons();
    Hobbies hobbies = new Hobbies();

    for (Person person1 : persons) {
      System.out.println("wanna add hobby to this person?--> " + person1.getName());
      String yesOrNo = this.sc.nextLine();
      if (yesOrNo.equals("yes")) {
        hobbies.addPersonHobbies(person1);
      }
    }

    for (Person person1 : persons) {
      hobbies.printPersonHobbies(person1);
    }
  }
}
