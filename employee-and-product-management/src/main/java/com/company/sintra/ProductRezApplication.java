package com.company.sintra;

import com.company.sintra.entity.DateProductsEntity;
import com.company.sintra.entity.ProductEntity;
import com.company.sintra.repository.ProductEntityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Set;

@SpringBootApplication
public class ProductRezApplication  {

    public static void main(String[] args) {
        SpringApplication.run(ProductRezApplication.class, args);
    }



}
