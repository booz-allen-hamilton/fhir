package com.bah.fhir.datatype;

public class Ratio extends Element {
  private static final long serialVersionUID = -2555495641010434841L;

  private Quantity numerator;
  private Quantity denominator;

  public Ratio() {}

  public Quantity getNumerator() {
    return numerator;
  }

  public void setNumerator(Quantity numerator) {
    this.numerator = numerator;
  }

  public Quantity getDenominator() {
    return denominator;
  }

  public void setDenominator(Quantity denominator) {
    this.denominator = denominator;
  }
}
