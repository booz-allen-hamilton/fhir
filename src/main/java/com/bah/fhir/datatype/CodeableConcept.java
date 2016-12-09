package com.bah.fhir.datatype;

import java.util.List;

public class CodeableConcept extends Element {
  private static final long serialVersionUID = -2489140884417217025L;

  private List<Coding> codings;
  private String text;

  public CodeableConcept() {}

  public List<Coding> getCodings() {
    return codings;
  }

  public void setCodings(List<Coding> codings) {
    this.codings = codings;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
}
