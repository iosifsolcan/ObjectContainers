package ro.Persons.Person;

import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeSet;

import ro.Persons.PersonAgeComparator.PersonAgeComparator;
import ro.Persons.PersonNameComparator.PersonNameComparator;

public class Person {
  Comparator<Person> comparator =
      (new PersonNameComparator()).thenComparing(new PersonAgeComparator());
  TreeSet<Person> persons = new TreeSet<>(comparator);
  private String name;
  private int age;

  public void addPerson() {
    Scanner sc = new Scanner(System.in);
    System.out.println("how many persons u wanna add?");
    int numberOfPersons = sc.nextInt();
    sc.nextLine();

    for (int i = 1; i <= numberOfPersons; ++i) {
      Person person = new Person();
      System.out.println("Give the person " + i + " name");
      person.name = sc.nextLine();
      System.out.println("Give the person " + i + " age");
      person.age = sc.nextInt();
      sc.nextLine();
      persons.add(person);
    }
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public TreeSet<Person> getPersons() {
    System.out.println("========================");
    System.out.println("Persons: ");

    for (Person person : persons) {
      System.out.println(person);
    }

    System.out.println("========================");
    return persons;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Person person)) return false;
    return age == person.age && Objects.equals(name, person.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age);
  }

  @Override
  public String toString() {
    return "Person{" + "name='" + name + '\'' + ", age=" + age + '\'' + '}';
  }
}
