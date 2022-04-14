/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba.alcancia.controller;
import com.prueba.alcancia.entity.Ahorro;
import com.prueba.alcancia.services.AhorroService;
import javax.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author COMPUMAX
 */
@RequiredArgsConstructor
@RestController()
@RequestMapping("/api")
public class AhorroController {
    
    private final AhorroService ahorroService;
    
     @PostMapping("/save")
     public Ahorro save(@RequestBody Ahorro ahorro){
        return ahorroService.save(ahorro);       
    }
    
    @GetMapping("/cantidad_monedas")
    public Long cantidadMonedas(){
        return ahorroService.cantidadMoneda();
    }
    
    @GetMapping("/total_ahorro/{denominacion}")
    public Long totalAhorroDenominacion(@PathVariable int denominacion){
        return ahorroService.totalAhorradoDenominacion(denominacion);
    }
    @GetMapping("/cantidad_monedas/{denominacion}")
    public Long cantidadMonedasDenominacion(@PathVariable int denominacion){
        return ahorroService.cantidadMonedasDenominacion(denominacion);
    }
    @GetMapping("/total_ahorro")
    public Long totalAhorrado(){
        return ahorroService.totalAhorro();
    }
}
