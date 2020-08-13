package com.tcs.poc.compositepkdemo.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embeddable;

@Embeddable
public class StateId implements Serializable {

  private String companyName;
  private String state;

  public StateId() {
  }

  public StateId(String companyName, String state) {
    this.companyName = companyName;
    this.state = state;
  }

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof StateId)) {
      return false;
    }
    StateId stateId = (StateId) o;
    return Objects.equals(getCompanyName(), stateId.getCompanyName()) &&
        Objects.equals(getState(), stateId.getState());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getCompanyName(), getState());
  }
}
