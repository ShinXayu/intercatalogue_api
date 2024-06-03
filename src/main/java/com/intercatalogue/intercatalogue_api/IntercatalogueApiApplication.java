package com.intercatalogue.intercatalogue_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import lombok.Data;

@Data
@SpringBootApplication
public class IntercatalogueApiApplication implements CommandLineRunner {

    @Autowired


    public static void main(String[] args) {
        SpringApplication.run(IntercatalogueApiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }

}
