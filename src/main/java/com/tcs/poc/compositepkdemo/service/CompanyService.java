package com.tcs.poc.compositepkdemo.service;

import com.tcs.poc.compositepkdemo.dto.CompanyCo;
import com.tcs.poc.compositepkdemo.dto.CompanyDto;
import com.tcs.poc.compositepkdemo.dto.StateCo;
import com.tcs.poc.compositepkdemo.entity.Company;
import com.tcs.poc.compositepkdemo.entity.CompanyId;
import com.tcs.poc.compositepkdemo.entity.State;
import java.util.List;

public interface CompanyService {

  Company createCompany(CompanyCo co);

  List<CompanyDto> getCompaniesData(CompanyId companyId);

  State createState(StateCo stateCo);
}
