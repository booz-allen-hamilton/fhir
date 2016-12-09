package com.bah.fhir.datatype;

public enum UnitsOfTime {
  SECONDS("s"),
  MINUTES("min"),
  HOURS("h"),
  DAYS("d"),
  WEEKS("wk"),
  MONTHS("mo"),
  YEARS("a");

  private String unit;

  UnitsOfTime(String unit) {
    this.unit = unit;
  }

  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }
}
