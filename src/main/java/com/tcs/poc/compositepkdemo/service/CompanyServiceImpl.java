package com.tcs.poc.compositepkdemo.service;

import com.tcs.poc.compositepkdemo.dao.CompanyRepository;
import com.tcs.poc.compositepkdemo.dao.StateRepository;
import com.tcs.poc.compositepkdemo.dto.CompanyCo;
import com.tcs.poc.compositepkdemo.dto.CompanyDto;
import com.tcs.poc.compositepkdemo.dto.StateCo;
import com.tcs.poc.compositepkdemo.entity.Company;
import com.tcs.poc.compositepkdemo.entity.CompanyId;
import com.tcs.poc.compositepkdemo.entity.State;
import com.tcs.poc.compositepkdemo.entity.StateId;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {

  @Autowired
  private StateRepository stateRepository;

  @Autowired
  private CompanyRepository companyRepository;

  @Override
  public Company createCompany(CompanyCo co) {
    CompanyId companyId = new CompanyId(co.getName(), co.getCity(), co.getState());
    StateId stateId = new StateId(co.getName(), co.getState());
    State state = stateRepository.findById(stateId)
        .orElse(null);
    Company company = new Company(companyId, co.getCountry(), state);
    return companyRepository.save(company);
  }

  @Override
  public List<CompanyDto> getCompaniesData(CompanyId companyId) {
    List<Company> companies = companyRepository.findAll();
    List<CompanyDto> companyDtos = new ArrayList<>();
    companies
        .forEach(company -> {
          CompanyDto dto = new CompanyDto();
          dto.setName(company.getCompanyId().getName())
              .setCity(company.getCompanyId().getCity())
              .setState(company.getCompanyId().getState())
              .setCountry(company.getCountry())
              .setStateDescription(company.getStateData().getDescription());
          companyDtos.add(dto);
        });
    return companyDtos;
  }

  @Override
  public State createState(StateCo stateCo) {
    StateId stateId = new StateId(stateCo.getCompanyName(), stateCo.getState());
    State state = new State(stateId, stateCo.getDescription());
    return stateRepository.save(state);
  }
}
