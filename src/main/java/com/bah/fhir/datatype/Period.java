package com.bah.fhir.datatype;

import java.time.LocalDateTime;

public class Period extends Element {
  private static final long serialVersionUID = 3684951902648701372L;

  private LocalDateTime start;
  private LocalDateTime end;

  public Period() {}

  public LocalDateTime getStart() {
    return start;
  }

  public void setStart(LocalDateTime start) {
    this.start = start;
  }

  public LocalDateTime getEnd() {
    return end;
  }

  public void setEnd(LocalDateTime end) {
    this.end = end;
  }
}
