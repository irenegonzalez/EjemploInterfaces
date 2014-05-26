/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teide.helipuerto;

/**
 *
 * @author DAM1
 */
public class Avion implements Volador{ //Sobre una inferface no se hereda, se implementa

    @Override
    public String despegar() {
       return "El avión ha despegado";
    }

    @Override
    public String aterrizar(int metros) {
       return "El avión ha aterrizado con un coste de " +(0.85*metros)+" €";
    }
    
}
