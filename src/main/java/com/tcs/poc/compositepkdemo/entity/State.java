package com.tcs.poc.compositepkdemo.entity;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class State implements Serializable {

  @EmbeddedId
  private StateId stateId;
  private String description;

  public State() {
  }

  public State(StateId stateId, String description) {
    this.stateId = stateId;
    this.description = description;
  }

  public StateId getStateId() {
    return stateId;
  }

  public void setStateId(StateId stateId) {
    this.stateId = stateId;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
