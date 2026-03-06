package com.api.config;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.http.HttpStatus;

import com.api.Exception.CustomException;
import com.api.Exception.ErrorResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

import feign.Response;
import feign.codec.ErrorDecoder;

public class CustomErrorDecoder implements ErrorDecoder {

    private static final ObjectMapper objectMapper =
            new ObjectMapper().findAndRegisterModules();

    @Override
    public Exception decode(String methodKey, Response response) {

        try {

            // ✅ If response body is null
            if (response.body() == null) {
                return new CustomException(
                        "Empty response from service",
                        HttpStatus.INTERNAL_SERVER_ERROR
                );
            }

            InputStream is = response.body().asInputStream();

            ErrorResponse errorResponse =
                    objectMapper.readValue(is, ErrorResponse.class);

            

            return new CustomException(
                    errorResponse.getMessage(),
                    errorResponse.getStatus());

        } catch (IOException e) {

            return new CustomException(
                    "Error while calling external service",
                    HttpStatus.INTERNAL_SERVER_ERROR
            );
        }
    }
}