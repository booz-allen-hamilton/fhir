package com.bah.fhir.resource;

import java.io.Serializable;

import com.bah.fhir.datatype.Meta;

public class Resource implements Serializable {
  private static final long serialVersionUID = 3865511644261384050L;

  private String id;
  private Meta meta;
  private String implicitRules;
  private String language;

  public Resource() {}

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Meta getMeta() {
    return meta;
  }

  public void setMeta(Meta meta) {
    this.meta = meta;
  }

  public String getImplicitRules() {
    return implicitRules;
  }

  public void setImplicitRules(String implicitRules) {
    this.implicitRules = implicitRules;
  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }
}
