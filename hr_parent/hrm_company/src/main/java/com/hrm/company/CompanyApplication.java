package com.hrm.company;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * @author AsheOne
 * @date 2022/2/2
 */
@SpringBootApplication(scanBasePackages = "com.hrm.company") // SpringBoot Scan
@EntityScan(value = "com.hrm.domain.company") // JPA Scan
public class CompanyApplication {
    public static void main (String[] args) {

        // Start
        SpringApplication.run(CompanyApplication.class,args);
    }
}
