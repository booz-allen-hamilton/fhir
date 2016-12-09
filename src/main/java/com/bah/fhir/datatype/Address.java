package com.bah.fhir.datatype;

import java.util.List;

public class Address extends Element {
  private static final long serialVersionUID = -9001402263122859643L;

  public enum AddressUse {
    HOME("Home"),
    WORK("Work"),
    TEMP("Temporary"),
    OLD("Old / Incorrect");

    private String use;

    AddressUse(String use) {
      this.use = use;
    }

    public String getUse() {
      return use;
    }

    public void setUse(String use) {
      this.use = use;
    }
  }

  private AddressUse use;
  private String type;
  private String text;
  private List<String> line;
  private String city;
  private String district;
  private String state;
  private String postalCode;
  private String country;
  private Period period;

  public Address() {}

  public AddressUse getUse() {
    return use;
  }

  public void setUse(AddressUse use) {
    this.use = use;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public List<String> getLine() {
    return line;
  }

  public void setLine(List<String> line) {
    this.line = line;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getDistrict() {
    return district;
  }

  public void setDistrict(String district) {
    this.district = district;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Period getPeriod() {
    return period;
  }

  public void setPeriod(Period period) {
    this.period = period;
  }
}
