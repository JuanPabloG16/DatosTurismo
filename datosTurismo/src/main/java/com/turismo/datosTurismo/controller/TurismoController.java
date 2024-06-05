package com.turismo.datosTurismo.controller;

import com.turismo.datosTurismo.model.Turismo_SanAndres;
import com.turismo.datosTurismo.service.TurismoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/turismo")
public class TurismoController {

    @Autowired
    private TurismoService turismoService;

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/getTurismo")
    public List<Turismo_SanAndres> getAllTurismo() {
        return turismoService.getAll();
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/getRandomTurismoId")
    public Integer getRandomTurismoId() {
        return turismoService.getRandomTurismoId();
    }
}
