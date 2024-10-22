package com.alimert.config;


import com.alimert.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public List<Employee> employeeList() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("1", "Ali", "Er"));
        employeeList.add(new Employee("2", "Berk", "Yil"));
        employeeList.add(new Employee("3", "Mert", "Diz"));
        employeeList.add(new Employee("4", "Yigit", "Kay"));
        employeeList.add(new Employee("5", "Kaan", "Zor"));


        return employeeList;

    }

}
