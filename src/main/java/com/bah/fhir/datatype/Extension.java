package com.bah.fhir.datatype;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Extension extends Element {
  private static final long serialVersionUID = 4246480551904901360L;

  private String url;
  private int valueIntger;
  private double valueDecimal;
  private LocalDateTime valueDateTime;
  private LocalDate valueDate;
  private Instant valueInstant;
  private String valueString;
  private String valueUri;
  private boolean valueBoolean;
  private String valueCode;
  private String valueMarkdown;
  private byte[] valueBase64Binary;
  private Coding valueCoding;
  private CodeableConcept valueCodeableConcept;
  private Attachment valueAttachment;
  private Identifier valueIdentifier;
  private Quantity valueQuantity;
  private Range valueRange;
  private Period valuePeriod;
  private Ratio valueRatio;
  private HumanName valueHumanName;
  private Address valueAddress;
  private ContactPoint valueContactPoint;

}
