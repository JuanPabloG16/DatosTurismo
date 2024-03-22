package com.turismo.datosTurismo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turismo.datosTurismo.model.Turismo_SanAndres;
import com.turismo.datosTurismo.repository.TurismoRepository;

@Service
public class TurismoService {

    @Autowired
    TurismoRepository turismoRepository;

    public List<Turismo_SanAndres> getAll() {
        return turismoRepository.findAll();
    }
}
