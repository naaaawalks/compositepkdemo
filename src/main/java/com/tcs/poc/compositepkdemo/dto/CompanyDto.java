package com.tcs.poc.compositepkdemo.dto;

public class CompanyDto {

  private String name;
  private String city;
  private String state;
  private String country;
  private String stateDescription;

  public String getName() {
    return name;
  }

  public CompanyDto setName(String name) {
    this.name = name;
    return this;
  }

  public String getCity() {
    return city;
  }

  public CompanyDto setCity(String city) {
    this.city = city;
    return this;
  }

  public String getState() {
    return state;
  }

  public CompanyDto setState(String state) {
    this.state = state;
    return this;
  }

  public String getCountry() {
    return country;
  }

  public CompanyDto setCountry(String country) {
    this.country = country;
    return this;
  }

  public String getStateDescription() {
    return stateDescription;
  }

  public CompanyDto setStateDescription(String stateDescription) {
    this.stateDescription = stateDescription;
    return this;
  }
}
