package com.bah.fhir.datatype;

import java.io.Serializable;
import java.util.List;

public class Element implements Serializable {
  private static final long serialVersionUID = -7866648546508604362L;

  private String id;
  private List<Extension> extensions;

  public Element() {}

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public List<Extension> getExtensions() {
    return extensions;
  }

  public void setExtensions(List<Extension> extensions) {
    this.extensions = extensions;
  }
}
