package ro.Persons.Person.Address;

public class Address {
  public String city;
  public String street;
  private String country;

  public Address() {}

  public String getCountry() {
    return this.country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public void setStreet(String street) {
    this.street = street;
  }
}
