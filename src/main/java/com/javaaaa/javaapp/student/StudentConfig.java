package com.javaaaa.javaapp.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student peter = new Student("Peter", LocalDate.of(2000, 10, 18),
                    "peter@gmail.com");
            Student mary = new Student("Mary", LocalDate.of(1999, 4, 3),
                    "mary@gmail.com");
            studentRepository.saveAll(List.of(peter, mary));
        };
    }
}
