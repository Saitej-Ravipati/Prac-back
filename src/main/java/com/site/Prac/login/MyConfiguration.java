package com.site.Prac.login;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyConfiguration {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/user/**") // Adjust the path as needed
                        .allowedOrigins("http://localhost:4200") // The origin of your Angular application
                        .allowedMethods("GET", "POST", "PUT", "DELETE"); // Allowed HTTP methods
            }
        };
    }
}
