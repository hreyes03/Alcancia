/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba.alcancia.services;

import com.prueba.alcancia.entity.Ahorro;

/**
 *
 * @author COMPUMAX
 */
public interface AhorroService {
    public Ahorro save(Ahorro ahorro);
    int totalAhorro();
    Long cantidadMoneda();
    int cantidadMonedasDenominacion();
    int totalAhorradoDenominacion();
}
