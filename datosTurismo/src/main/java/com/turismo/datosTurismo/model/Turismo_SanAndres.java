package com.turismo.datosTurismo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "turismo_san_andres")
public class Turismo_SanAndres {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rnt")
    private Integer rtn;

    @Column(name = "año")
    private int ano;

    @Column(name = "estado")
    private String estado;

    @Column(name = "razon_social")
    private String razonSocial;

    @Column(name = "categoria")
    private String categoria;

    @Column(name = "subcategoria")
    private String subcategoria;

    @Column(name = "departamento")
    private String departamento;

    @Column(name = "municipio")
    private String municipio;

    @Column(name = "habitaciones")
    private int habitaciones;

    @Column(name = "camas")
    private int camas;

    @Column(name = "empleados")
    private int empleados;
}