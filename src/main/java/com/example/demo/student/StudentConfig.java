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
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student vlad = new Student(
                    "Vlad",
                    "vlad@ya.ru",
                    LocalDate.of(2005, Month.JANUARY, 31)
            );

            Student tima = new Student(
                    "Tima",
                    "timophey@ya.ru",
                    LocalDate.of(2005, Month.JANUARY, 1)
            );

            repository.saveAll(
                    List.of(vlad, tima)
            );
        };
    }
}
