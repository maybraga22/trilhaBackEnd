package com.trilha.back.adapters.configuration;

import com.trilha.back.application.ports.CategoryRepositoryPort;
import com.trilha.back.application.ports.CategoryServicePort;
import com.trilha.back.application.ports.EntryRepositoryPort;
import com.trilha.back.application.ports.EntryServicePort;
import com.trilha.back.application.services.CategoryService;
import com.trilha.back.application.services.EntryService;
import com.trilha.back.financys.FinancysApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = FinancysApplication.class)
public class BeanConfig {

    @Bean
    CategoryServicePort categoryService(CategoryRepositoryPort categoryRepositoryPort) {
        return new CategoryService(categoryRepositoryPort);
    }

    @Bean
    EntryServicePort entryService(EntryRepositoryPort entryRepositoryPort) {
        return new EntryService(entryRepositoryPort);
    }
}
