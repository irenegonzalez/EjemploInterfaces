/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.teide.helipuerto;

import java.util.ArrayList;

/**
 *
 * @author DAM1
 */
public class Helipuerto {
    
   private ArrayList<Volador> listado = new ArrayList<>();
    
   
   
   public boolean eliminar (int pos) {
       if(pos<listado.size()){
            listado.remove(posicion);
            return true;
       }
       return false;
   }
   
  
        
   public String  darPermisoParaDespegar (int pos) {
       
       if(pos<listado.size()) return listado.get(pos).despegar();
       return null;
       
   }     
    
    
}
