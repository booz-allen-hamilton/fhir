package com.bah.fhir.datatype;

public enum TimingAbbreviation {
  QD("QD"),
  QOD("QOD"),
  Q4H("Q4H"),
  Q6H("Q6H"),
  BID("BID"),
  TID("TID"),
  QID("QID"),
  AM("AM"),
  PM("PM");

  private String abbreviation;

  TimingAbbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
  }

  public String getAbbreviation() {
    return abbreviation;
  }

  public void setAbbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
  }
}
