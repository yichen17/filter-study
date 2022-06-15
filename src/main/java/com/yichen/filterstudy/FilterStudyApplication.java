package com.yichen.filterstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.yichen", "com.banyu"})
@ComponentScan(basePackages = {"com.banyu", "com.yichen"})
public class FilterStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(FilterStudyApplication.class, args);
    }

}
