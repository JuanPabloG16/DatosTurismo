package com.turismo.datosTurismo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.turismo.datosTurismo.model.Turismo_SanAndres;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TurismoRepository extends JpaRepository<Turismo_SanAndres, Integer> {
    
    @Query(value = "SELECT * FROM Turismo_SanAndres ORDER BY RAND() LIMIT 1", nativeQuery = true)
    Turismo_SanAndres findRandom();
}
