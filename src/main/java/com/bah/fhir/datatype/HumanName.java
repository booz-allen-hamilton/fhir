package com.bah.fhir.datatype;

import java.util.List;

public class HumanName extends Element {
  private static final long serialVersionUID = 5526757900044409659L;

  public enum NameUse {
    USUAL("Usual"),
    OFFICIAL("Official"),
    TEMP("Temp"),
    NICKNAME("Nickname"),
    ANONYMOUS("Anonymous"),
    OLD("Old"),
    MAIDEN("Maiden");

    private String use;

    NameUse(String use) {
      this.use = use;
    }

    public String getUse() {
      return use;
    }

    public void setUse(String use) {
      this.use = use;
    }
  }

  private NameUse use;
  private String text;
  private List<String> family;
  private List<String> given;
  private List<String> prefix;
  private List<String> suffix;
  private Period period;

  public HumanName() {}

  public NameUse getUse() {
    return use;
  }

  public void setUse(NameUse use) {
    this.use = use;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public List<String> getFamily() {
    return family;
  }

  public void setFamily(List<String> family) {
    this.family = family;
  }

  public List<String> getGiven() {
    return given;
  }

  public void setGiven(List<String> given) {
    this.given = given;
  }

  public List<String> getPrefix() {
    return prefix;
  }

  public void setPrefix(List<String> prefix) {
    this.prefix = prefix;
  }

  public List<String> getSuffix() {
    return suffix;
  }

  public void setSuffix(List<String> suffix) {
    this.suffix = suffix;
  }

  public Period getPeriod() {
    return period;
  }

  public void setPeriod(Period period) {
    this.period = period;
  }
}
