package com.bah.fhir.datatype;

public class Identifier extends Element {
  private static final long serialVersionUID = -6835176376822551324L;

  private String use;
  private CodeableConcept type;
  private String system;
  private String value;
  private Period period;
}
