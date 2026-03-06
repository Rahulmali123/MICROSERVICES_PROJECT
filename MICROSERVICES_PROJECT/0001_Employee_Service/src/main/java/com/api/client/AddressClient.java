package com.api.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.api.config.FeignConfig;
import com.api.model.dto.AddressDto;

@FeignClient(name = "address-service",configuration = FeignConfig.class)
public interface AddressClient {

    @GetMapping("/addresses/empId/{empId}")
    List<AddressDto> getAddressByEmpId(@PathVariable Long empId);
}