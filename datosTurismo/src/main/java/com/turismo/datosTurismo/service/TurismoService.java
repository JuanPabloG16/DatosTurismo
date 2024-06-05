package com.turismo.datosTurismo.service;

import com.turismo.datosTurismo.model.Turismo_SanAndres;
import com.turismo.datosTurismo.repository.TurismoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurismoService {

    @Autowired
    private TurismoRepository turismoRepository;

    public List<Turismo_SanAndres> getAll() {
        return turismoRepository.findAll();
    }

    public Integer getRandomTurismoId() {
        List<Turismo_SanAndres> turismoList = turismoRepository.findAll();
        if (!turismoList.isEmpty()) {
            int randomIndex = (int) (Math.random() * turismoList.size());
            return turismoList.get(randomIndex).getRtn(); // Utiliza getRnt() o el nombre correcto del método
        } else {
            return null;
        }
    }
}
