package com.api.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.model.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> 
{
    Optional<Employee> findByEmpCodeAndCompanyName(String empCode, String companyName);
}