/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teide.helipuerto;

/**
 *
 * @author DAM1
 */
public interface Volador {
  
    public abstract String despegar(); //Las interfaces se escriben así ya que no hay que desarrolar el metodo, solo indica que esem metodo lo tienen todas las clases hijas.
    public abstract String aterrizar (int metros);
}
