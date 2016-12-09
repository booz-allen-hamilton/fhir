package com.bah.fhir.datatype;

import java.time.Instant;
import java.util.List;

public class Meta extends Element {
  private static final long serialVersionUID = -6941365537590900124L;

  private String versionId;
  private Instant lastUpdated;
  private List<String> profiles;
  private List<Coding> securityLabels;
  private List<Coding> tags;

  public Meta() {}

  public String getVersionId() {
    return versionId;
  }

  public void setVersionId(String versionId) {
    this.versionId = versionId;
  }

  public Instant getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(Instant lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public List<String> getProfiles() {
    return profiles;
  }

  public void setProfiles(List<String> profiles) {
    this.profiles = profiles;
  }

  public List<Coding> getSecurityLabels() {
    return securityLabels;
  }

  public void setSecurityLabels(List<Coding> securityLabels) {
    this.securityLabels = securityLabels;
  }

  public List<Coding> getTags() {
    return tags;
  }

  public void setTags(List<Coding> tags) {
    this.tags = tags;
  }
}
