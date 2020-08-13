package com.tcs.poc.compositepkdemo.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embeddable;

@Embeddable
public class CompanyId implements Serializable {

  private String name;
  private String city;
  private String state;

  public CompanyId() {
  }

  public CompanyId(String name, String city, String state) {
    this.name = name;
    this.city = city;
    this.state = state;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
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
    if (!(o instanceof CompanyId)) {
      return false;
    }
    CompanyId companyId = (CompanyId) o;
    return Objects.equals(getName(), companyId.getName()) &&
        Objects.equals(getCity(), companyId.getCity()) &&
        Objects.equals(getState(), companyId.getState());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getName(), getCity(), getState());
  }
}
