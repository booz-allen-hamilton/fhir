package com.bah.fhir.datatype;

public class Range extends Element {
  private static final long serialVersionUID = -1212539208477653340L;

  private double low;
  private double high;

  public Range() {}

  public double getLow() {
    return low;
  }

  public void setLow(double low) {
    if (low > high) {
      throw new IllegalArgumentException("'low' value is greater than 'high' value.");
    }

    this.low = low;
  }

  public double getHigh() {
    return high;
  }

  public void setHigh(double high) {
    if (high < low) {
      throw new IllegalArgumentException("'high' value is less than 'low' value.");
    }

    this.high = high;
  }
}
