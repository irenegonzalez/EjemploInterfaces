/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.teide.helipuerto;

/**
 *
 * @author DAM1
 */
public class Pajaro implements Volador{

    @Override
    public String despegar() {
        return "El pájaro alza el vuelo";
    }

    @Override
    public String aterrizar(int metros) {
       return "El pájaro ha aterrizado ¡y está venga pio pio... y venga y venga a piar!";
    }
    
}
