package com.vitalykuleshov.spring.rest.configuration;

import com.vitalykuleshov.spring.rest.entity.Employee;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Configuration
@ComponentScan("com.vitalykuleshov.spring.rest")
public class MyConfig {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
