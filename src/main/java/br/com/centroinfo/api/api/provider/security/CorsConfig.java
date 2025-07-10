package br.com.centroinfo.api.api.provider.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**") // ou apenas "/auth/**"
                        .allowedOrigins("http://localhost:5173") // frontend dev
                        // .allowedOrigins("http://localhost:4173") // frontend build
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                        .allowedHeaders("*")
                        // .allowedHeaders("Authorization", "Content-Type");
                        .allowCredentials(true);
            }
        };
    }
}
