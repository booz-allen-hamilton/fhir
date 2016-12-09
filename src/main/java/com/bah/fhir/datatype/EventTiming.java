package com.bah.fhir.datatype;

public enum EventTiming {
  HS("HS",
      "Prior to beginning a regular period of extended sleep (this would exclude naps). Note that this might occur " +
          "at different times of day depending on a person's regular sleep schedule"),
  WAKE("WAKE",
      "Upon waking up from a regular period of sleep, in order to start regular activities (this would exclude waking" +
          " up from a nap or temporarily waking up during a period of sleep)\nUsage Notes: e.g.\nTake pulse rate on " +
          "waking in management of thyrotoxicosis.\nTake BP on waking in management of hypertension\nTake basal body " +
          "temperature on waking in establishing date of ovulation"),
  C("C", "Meal"),
  CM("CM", "Breakfast"),
  CD("CD", "Lunch"),
  CV("CV", "Dinner"),
  AC("AC", "Before meal"),
  ACM("ACM", "Before breakfast"),
  ACD("ACD", "Before lunch"),
  ACV("ACV", "Before dinner"),
  PC("PC", "After Meal"),
  PCM("PCM", "After breakfast"),
  PCD("PCD", "After Lunch"),
  PCV("PCV", "AFter dinner");

  private String display;
  private String description;

  EventTiming(String display, String description) {
    this.display = display;
    this.description = description;
  }

  public String getDisplay() {
    return display;
  }

  public void setDisplay(String display) {
    this.display = display;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
