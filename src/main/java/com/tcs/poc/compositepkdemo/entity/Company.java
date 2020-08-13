package com.tcs.poc.compositepkdemo.entity;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Company implements Serializable {

  @EmbeddedId
  private CompanyId companyId;
  private String country;

  @OneToOne
  private State stateData;

  public Company() {
  }

  public Company(CompanyId companyId, String country,
      State stateData) {
    this.companyId = companyId;
    this.country = country;
    this.stateData = stateData;
  }

  public CompanyId getCompanyId() {
    return companyId;
  }

  public void setCompanyId(CompanyId companyId) {
    this.companyId = companyId;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public State getStateData() {
    return stateData;
  }

  public void setStateData(State stateData) {
    this.stateData = stateData;
  }
}
