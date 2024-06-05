package com.turismo.datosTurismo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turismo.datosTurismo.model.Turismo_SanAndres;
import com.turismo.datosTurismo.service.TurismoService;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/turismo")
@CrossOrigin(origins = "http://localhost:5173")
public class TurismoController {

    @Autowired
    TurismoService turismoService;

    @GetMapping("/getTurismo")
    public List<Turismo_SanAndres> getAllTurismo() {
        return turismoService.getAll();
    }

    @GetMapping("/getRandomId")
    public Integer getRandomId() {
        return turismoService.getRandomId();
    }
}
