package com.tcs.poc.compositepkdemo.dao;

import com.tcs.poc.compositepkdemo.entity.Company;
import com.tcs.poc.compositepkdemo.entity.CompanyId;
import java.util.List;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, CompanyId> {

  @Override
  @EntityGraph(attributePaths = {"stateData"})
  List<Company> findAll();
}
