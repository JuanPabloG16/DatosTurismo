package com.turismo.datosTurismo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.turismo.datosTurismo.model.Turismo_SanAndres;
import com.turismo.datosTurismo.repository.TurismoRepository;

import java.util.List;

@Service
public class TurismoService {

    @Autowired
    TurismoRepository turismoRepository;

    public List<Turismo_SanAndres> getAll() {
        return turismoRepository.findAll();
    }

    public Integer getRandomTurismoId() {
        Turismo_SanAndres randomTurismo = turismoRepository.findRandom();
        return randomTurismo != null ? randomTurismo.getRtn() : null;
    }
}
