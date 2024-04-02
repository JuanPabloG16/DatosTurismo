package com.turismo.datosTurismo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class DatosTurismoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatosTurismoApplication.class, args);
    }

    // Habilitar CORS
	@Bean
public WebMvcConfigurer corsConfigurer() {
    return new WebMvcConfigurer() {
        @Override
        public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/**").allowedOrigins("http://m59u5jnbfn.loclx.io/","http://localhost:8080", "http://localhost:5173").allowedMethods("GET","POST","PUT","DELETE").allowedHeaders("*").maxAge(3600);
        }
    };
}

}
