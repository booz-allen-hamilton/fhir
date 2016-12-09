package com.bah.fhir.datatype;

public class Coding extends Element {
  private static final long serialVersionUID = -7175669505392500842L;

  private String system;
  private String version;
  private String code;
  private String display;
  private boolean userSelelcted;

  public Coding() {}

  public String getSystem() {
    return system;
  }

  public void setSystem(String system) {
    this.system = system;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getDisplay() {
    return display;
  }

  public void setDisplay(String display) {
    this.display = display;
  }

  public boolean isUserSelelcted() {
    return userSelelcted;
  }

  public void setUserSelelcted(boolean userSelelcted) {
    this.userSelelcted = userSelelcted;
  }
}
