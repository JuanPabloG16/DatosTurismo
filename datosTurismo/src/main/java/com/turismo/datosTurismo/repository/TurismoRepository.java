package com.turismo.datosTurismo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.turismo.datosTurismo.model.Turismo_SanAndres;
import org.springframework.stereotype.Repository;

@Repository
public interface TurismoRepository extends JpaRepository<Turismo_SanAndres, Integer> {
    // Consulta específica para MySQL
    @Query(value = "SELECT * FROM Turismo_SanAndres ORDER BY RAND() LIMIT 1", nativeQuery = true)
    Turismo_SanAndres findRandom();

    // Otra opción más compatible con diferentes bases de datos
    // @Query(value = "SELECT * FROM Turismo_SanAndres OFFSET floor(random() * (SELECT COUNT(*) FROM Turismo_SanAndres)) LIMIT 1", nativeQuery = true)
    // Turismo_SanAndres findRandom();
}
