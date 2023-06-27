package com.saveetha.employee.emp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class EmployeeConfiguration {
    @Bean
    CommandLineRunner commandLineRunner(EmployeeRepository employeeRepository) {
        return args -> {
            Employee sai = new Employee(
                    "Sai",
                    LocalDate.of(2003, Month.MARCH, 20),
                    "sai@gamil.com"
            );

            Employee stark = new Employee(
                    "Stark",
                    LocalDate.of(1970, Month.APRIL, 28),
                    "stark@gmail.com"
            );

            employeeRepository.saveAll(
                    List.of(sai, stark)
            );
        };
    }

}