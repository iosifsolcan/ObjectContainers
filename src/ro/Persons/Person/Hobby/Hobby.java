package ro.Persons.Person.Hobby;

import java.util.List;
import ro.Persons.Person.Address.Address;

public class Hobby {
  private final String name;
  public int frequency;
  private final List<Address> addresses;

  public Hobby(String name, int frequency, List<Address> addresses) {
    this.name = name;
    this.frequency = frequency;
    this.addresses = addresses;
  }

  public String getName() {
    return this.name;
  }

  public List<Address> getAddresses() {
    return this.addresses;
  }
}
