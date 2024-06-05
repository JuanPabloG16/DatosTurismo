package com.turismo.datosTurismo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turismo.datosTurismo.model.Turismo_SanAndres;
import com.turismo.datosTurismo.repository.TurismoRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class TurismoService {

    @Autowired
    TurismoRepository turismoRepository;

    @PersistenceContext
    private EntityManager entityManager;

    public List<Turismo_SanAndres> getAll() {
        return turismoRepository.findAll();
    }

    public Integer getRandomId() {
        List<Integer> ids = entityManager.createQuery("SELECT t.id FROM Turismo_SanAndres t ORDER BY RAND()", Integer.class)
                                            .setMaxResults(1)
                                            .getResultList();
        if (ids.isEmpty()) {
            return null; // o lanzar una excepción si lo prefieres
        } else {
            return ids.get(0);
        }
    }
}
