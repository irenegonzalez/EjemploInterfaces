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
    
   ArrayList<Volador> listado = new ArrayList<>();
 
   public boolean eliminar (int pos) {
       if(pos<listado.size()){
            listado.remove(pos);
            return true;
       }
       return false;
   }
    
   public void añadir (Volador v){
       listado.add(v); 
   }
   
   public String  darPermisoParaDespegar (int pos) {
       
       if(pos<listado.size()) return listado.get(pos).despegar();
       return null;
   }
       
   public String permisoAterrizar (int pos, int metros) {
       if (pos<listado.size()) return listado.get(pos).aterrizar(metros);
       return null;
   }     
    
    
}
