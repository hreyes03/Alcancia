/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba.alcancia.services.impl;

import com.prueba.alcancia.entity.Ahorro;
import com.prueba.alcancia.repository.AhorroRepository;
import com.prueba.alcancia.services.AhorroService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 *
 * @author COMPUMAX
 */
@Service
@RequiredArgsConstructor
public class AhorroServicesImpl implements AhorroService{

    private final AhorroRepository ahorroRepository;
    
    @Override
    public Ahorro save(Ahorro ahorro) {
        return ahorroRepository.save(ahorro);
    }

    @Override
    public Long totalAhorro() {
        return ahorroRepository.sumTotals();
    }

    @Override
    public Long cantidadMoneda() {
        return ahorroRepository.sumQuantities();
    }

    @Override
    public Long cantidadMonedasDenominacion(int denominacion) {
        return ahorroRepository.sumQuantitiesByDenomination(denominacion);
    }

    @Override
    public Long totalAhorradoDenominacion(int denominacion) {
        return ahorroRepository.sumTotalsByDenomination(denominacion);
    }
    
}
