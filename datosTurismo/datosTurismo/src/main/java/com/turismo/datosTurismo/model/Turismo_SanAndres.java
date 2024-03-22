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
@Table(name = "Turismo_SanAndres")
public class Turismo_SanAndres {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Rnt")
    private Integer Rtn;

    @Column(name = "Año")
    private int ano;

    @Column(name = "Estado")
    private String estado;

    @Column(name = "Razon_social")
    private String razonSocial;

    @Column(name = "Categoria")
    private String categoria;

    @Column(name = "Subcategoria")
    private String subcategoria;

    @Column(name = "Departamento")
    private String departamento;

    @Column(name = "Municipio")
    private String municipio;

    @Column(name = "Habitaciones")
    private int habitaciones;

    @Column(name = "Camas")
    private int camas;

    @Column(name = "Empleados")
    private int empleados;
}
