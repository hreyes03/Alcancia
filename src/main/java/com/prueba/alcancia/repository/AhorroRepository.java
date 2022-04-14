/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba.alcancia.repository;

import com.prueba.alcancia.entity.Ahorro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author COMPUMAX
 */
@Repository
public interface AhorroRepository extends JpaRepository<Ahorro, Long>{
    
    @Query(value = "SELECT sum(cantidad) FROM Ahorro")
    public Long sumQuantities();
}
