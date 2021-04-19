/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.comportamientoavanzado;

import static java.lang.Math.random;
import java.util.ArrayList;

/**
 *
 * @author mandi
 */
public class Dado {
private int dado;

    public Dado() {
    }

 public int randomDado(){
     dado=(int)(Math.random()*(6-1+1)+1);
       return dado;
   }
   public void setDado(int dado){
       this.dado=dado;
   }
   
   public void lanzarDado(){
       System.out.println("El valor del dado es "+dado);
   }
}
