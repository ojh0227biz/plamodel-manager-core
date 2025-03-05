package com.plamodel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.plamodel.mapper")
public class PlamodelManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlamodelManagerApplication.class, args);
    }
}
