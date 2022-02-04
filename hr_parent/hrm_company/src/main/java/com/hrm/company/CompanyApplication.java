package com.hrm.company;

import com.hrm.common.utils.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

/**
 * @author AsheOne
 * @date 2022/2/2
 */
@SpringBootApplication(scanBasePackages = "com.hrm") // SpringBoot Scan
@EntityScan(value = "com.hrm.domain.company") // JPA Scan
public class CompanyApplication {
    public static void main (String[] args) {
        SpringApplication.run(CompanyApplication.class,args);
    }

    @Bean
    public IdWorker idWorker(){
        return new IdWorker();
    }
}
