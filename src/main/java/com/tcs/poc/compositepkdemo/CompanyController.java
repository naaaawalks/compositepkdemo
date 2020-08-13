package com.tcs.poc.compositepkdemo;

import com.tcs.poc.compositepkdemo.dto.CompanyCo;
import com.tcs.poc.compositepkdemo.dto.CompanyDto;
import com.tcs.poc.compositepkdemo.dto.StateCo;
import com.tcs.poc.compositepkdemo.entity.Company;
import com.tcs.poc.compositepkdemo.entity.CompanyId;
import com.tcs.poc.compositepkdemo.entity.State;
import com.tcs.poc.compositepkdemo.service.CompanyService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/company")
public class CompanyController {

  @Autowired
  private CompanyService companyService;

  @PostMapping(value = "data", produces = "application/json")
  @ApiOperation(value = "Create company")
  @ApiResponses({@ApiResponse(code = 200, message = "Company gets created"),
      @ApiResponse(code = 500, message = "Internal server error")})
  public Company createCompany(@RequestBody CompanyCo companyCo) {
    return companyService.createCompany(companyCo);
  }

  @PostMapping(value = "all-data", produces = "application/json")
  @ApiOperation(value = "Get companies")
  @ApiResponses({@ApiResponse(code = 200, message = "All companies retrieved successfully"),
      @ApiResponse(code = 500, message = "Internal server error")})
  public List<CompanyDto> getCompanies(@RequestBody CompanyId key) {
    return companyService.getCompaniesData(key);
  }

  @PostMapping(value = "state", produces = "application/json")
  @ApiOperation(value = "Create state")
  @ApiResponses({@ApiResponse(code = 200, message = "State gets created"),
      @ApiResponse(code = 500, message = "Internal server error")})
  public State createState(@RequestBody StateCo co) {
    return companyService.createState(co);
  }
}
