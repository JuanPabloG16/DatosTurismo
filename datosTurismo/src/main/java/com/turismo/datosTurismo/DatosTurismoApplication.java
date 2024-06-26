package com.turismo.datosTurismo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.lang.NonNull; // Agregar esta importación
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EntityScan("com.turismo.datosTurismo.model") // Esta es la línea que debes agregar
public class DatosTurismoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatosTurismoApplication.class, args);
    }

    // Habilitar CORS
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(@NonNull CorsRegistry registry) { // Agregar @NonNull aquí
                // Aquí se está permitiendo el acceso CORS a todas las rutas (/**)
                // desde todos los orígenes (*).
                // Se están permitiendo todos los métodos HTTP.
                // Se están permitiendo todos los encabezados.
                // Se está estableciendo un tiempo máximo de pre-vuelo (preflight) de 3600 segundos.
                registry.addMapping("/**").allowedOrigins("*").allowedMethods("*").allowedHeaders("*").maxAge(3600);
            }
        };
    }
}
