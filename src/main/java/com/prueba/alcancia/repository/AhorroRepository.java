/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba.alcancia.repository;

import com.prueba.alcancia.entity.Ahorro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author COMPUMAX
 */
@Repository
public interface AhorroRepository extends JpaRepository<Ahorro, Long>{
    
    @Query(value = "SELECT sum(cantidad) FROM Ahorro")
    public Long sumQuantities();
    
    @Query(value = "SELECT sum(cantidad*tipoMoneda) FROM Ahorro")
    public Long sumTotals();
    
    @Query(value = "SELECT sum(a.cantidad) FROM Ahorro a where a.tipoMoneda =:denominacion")
    public Long sumQuantitiesByDenomination(@Param("denominacion") int denominacion);
    
    @Query(value = "SELECT sum(a.cantidad*a.tipoMoneda) FROM Ahorro a where a.tipoMoneda =:denominacion")
    public Long sumTotalsByDenomination(@Param("denominacion") int denominacion);
}
