package com.tcs.poc.compositepkdemo.dao;

import com.tcs.poc.compositepkdemo.entity.State;
import com.tcs.poc.compositepkdemo.entity.StateId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, StateId> {

}
