package com.api.serivce;

import java.util.List;

import com.api.model.dto.EmployeeDto;

public interface EmployeeService {

    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    EmployeeDto updateEmployee(Long id, EmployeeDto employeeDto);

    void deleteEmployee(Long id);

    EmployeeDto getSingleEmployee(Long id);

    List<EmployeeDto> getAllEmployees();

    EmployeeDto getEmployeeByEmpCodeAndCompanyName(String empCode, String companyName);
}
