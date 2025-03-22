package com.example.demo.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student adrian = new Student(
                    "Adrian",
                    "adrian@work.com",
                    LocalDate.of(2003, Month.SEPTEMBER, 12)
            );

            Student julian = new Student(
                    "Julian",
                    "julian@work.com",
                    LocalDate.of(2000, Month.JULY, 11)
            );

            studentRepository.saveAll(
                    List.of(adrian,julian)
            );

        };


    }

}
