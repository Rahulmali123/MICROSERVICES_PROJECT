package com.address.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.address.config.FeignConfig;
import com.address.model.dto.EmployeeDto;

@FeignClient(
        name = "employeeClient",
        url = "${employee.service.url}",
        configuration = FeignConfig.class
)
public interface EmployeeClient {

    @GetMapping("/employees/{id}")
    EmployeeDto getSingleEmployee(@PathVariable Long id);
}