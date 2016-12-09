package com.bah.fhir.datatype;

public class ContactPoint extends Element {
  private static final long serialVersionUID = -3028152974546677895L;

  public enum ContactPointSystem {
    PHONE("Phone"),
    FAX("Fax"),
    EMAIL("Email"),
    PAGER("Pager"),
    OTHER("URL");

    private String system;

    ContactPointSystem(String system) {
      this.system = system;
    }

    public String getSystem() {
      return system;
    }

    public void setSystem(String system) {
      this.system = system;
    }
  }

  public enum ContactPointUse {
    HOME("Home"),
    WORK("Work"),
    TEMP("Temp"),
    OLD("Old"),
    MOBILE("Moile");

    private String use;

    ContactPointUse(String use) {
      this.use = use;
    }

    public String getUse() {
      return use;
    }

    public void setUse(String use) {
      this.use = use;
    }
  }

  private ContactPointSystem system;
  private String value;
  private ContactPointUse use;
  private int rank;
  private Period period;

  public ContactPoint() {}

  public ContactPointSystem getSystem() {
    return system;
  }

  public void setSystem(ContactPointSystem system) {
    this.system = system;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public ContactPointUse getUse() {
    return use;
  }

  public void setUse(ContactPointUse use) {
    this.use = use;
  }

  public int getRank() {
    return rank;
  }

  public void setRank(int rank) {
    this.rank = rank;
  }

  public Period getPeriod() {
    return period;
  }

  public void setPeriod(Period period) {
    this.period = period;
  }
}
