/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.comportamientoavanzado;

/**
 *
 * @author mandi
 */
public class Moneda {
    private int cara=0;
    private int cruz=0;
    private int aleatorio=(int)(Math.random()*10);

    public void lanzarMoneda()
    {
        for(int i=0;i<10;i++)
        {
            if(cara!=aleatorio)
            {
                cara++;
            }else{
                cruz++;
            }
        }
        System.out.println("Resultados del lanzamiento de una moneda 10 veces");
        System.out.println("Cara: " + cara+ " \nCruz: "+ cruz);
        System.out.println("hola");
    }
    
    
}
