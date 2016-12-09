package com.bah.fhir.datatype;

import java.io.Serializable;

public class Quantity implements Serializable {
  private static final long serialVersionUID = 5189361781972933644L;

  private double value;
  private String comparator;
  private String unit;
  private String system;
  private String code;

  public Quantity() {}

  public double getValue() {
    return value;
  }

  public void setValue(double value) {
    this.value = value;
  }

  public String getComparator() {
    return comparator;
  }

  public void setComparator(String comparator) {
    this.comparator = comparator;
  }

  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public String getSystem() {
    return system;
  }

  public void setSystem(String system) {
    this.system = system;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }
}
