package com.bah.fhir.datatype;

import java.time.LocalDateTime;

public class Attachment extends Element {
  private static final long serialVersionUID = 5458032671481720017L;

  private String contentType;
  private String language;
  private byte[] data;
  private String url;
  private int size;
  private byte[] hash;
  private String title;
  private LocalDateTime creation;

  public Attachment() {}

  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public byte[] getData() {
    return data;
  }

  public void setData(byte[] data) {
    this.data = data;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public byte[] getHash() {
    return hash;
  }

  public void setHash(byte[] hash) {
    this.hash = hash;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public LocalDateTime getCreation() {
    return creation;
  }

  public void setCreation(LocalDateTime creation) {
    this.creation = creation;
  }
}
