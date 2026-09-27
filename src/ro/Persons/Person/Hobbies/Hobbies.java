package ro.Persons.Person.Hobbies;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import ro.Persons.Person.Person;
import ro.Persons.Person.Address.Address;
import ro.Persons.Person.Hobby.Hobby;

public class Hobbies {
  HashMap<Person, List<Hobby>> hobbies = new HashMap<>();
  Scanner sc = new Scanner(System.in);

  public Hobbies() {}

  public Address initializeAddress() {
    Address address = new Address();
    System.out.println("Enter the country");
    String country = sc.nextLine();
    address.setCountry(country);
    System.out.println("Enter the city");
    String city = sc.nextLine();
    address.setCity(city);
    System.out.println("Enter the street");
    String street = sc.nextLine();
    address.setStreet(street);
    return address;
  }

  public Hobby initializeHobby() {
    System.out.println("Enter the hobby name");
    String name = this.sc.nextLine();
    System.out.println("How many times per week?");
    int frequency = this.sc.nextInt();
    this.sc.nextLine();
    System.out.println("How many addresses?");
    int numberOfAddresses = this.sc.nextInt();
    this.sc.nextLine();
    List<Address> addresses = new ArrayList<>();

    for (int i = 1; i <= numberOfAddresses; ++i) {
      System.out.println("Enter address " + i);
      Address address = this.initializeAddress();
      addresses.add(address);
    }

    return new Hobby(name, frequency, addresses);
  }

  public void addPersonHobbies(Person person) {
    System.out.println("How many hobbies does this person have?");
    int numberOfHobbies = this.sc.nextInt();
    this.sc.nextLine();
    List<Hobby> personHobbies = new ArrayList<>();

    for (int i = 1; i <= numberOfHobbies; ++i) {
      System.out.println("Hobby " + i);
      Hobby hobby = this.initializeHobby();
      personHobbies.add(hobby);
    }

    hobbies.put(person, personHobbies);
  }

  public void printPersonHobbies(Person person) {
    System.out.println("=========================================");
    List<Hobby> personHobbies = hobbies.get(person);
    if (personHobbies == null) {
      System.out.println("This person has no hobbies.---> " + person.getName());
    } else {
      System.out.println("Hobbies for " + person.getName() + ":");

      for (Hobby hobby : personHobbies) {
        System.out.println("Hobby: " + hobby.getName());
        System.out.println("Countries where it can be practiced:");

        for (Address address : hobby.getAddresses()) {
          System.out.println(address.getCountry());
        }
      }

      System.out.println("=========================================");
    }
  }
}
