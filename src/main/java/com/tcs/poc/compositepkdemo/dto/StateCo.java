package com.tcs.poc.compositepkdemo.dto;

public class StateCo {

  private String companyName;
  private String state;
  private String description;

  public String getCompanyName() {
    return companyName;
  }

  public StateCo setCompanyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

  public String getState() {
    return state;
  }

  public StateCo setState(String state) {
    this.state = state;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public StateCo setDescription(String description) {
    this.description = description;
    return this;
  }
}
