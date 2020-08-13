package com.tcs.poc.compositepkdemo.dto;

public class CompanyCo {

  private String name;
  private String city;
  private String state;
  private String country;

  public String getName() {
    return name;
  }

  public CompanyCo setName(String name) {
    this.name = name;
    return this;
  }

  public String getCity() {
    return city;
  }

  public CompanyCo setCity(String city) {
    this.city = city;
    return this;
  }

  public String getState() {
    return state;
  }

  public CompanyCo setState(String state) {
    this.state = state;
    return this;
  }

  public String getCountry() {
    return country;
  }

  public CompanyCo setCountry(String country) {
    this.country = country;
    return this;
  }
}
