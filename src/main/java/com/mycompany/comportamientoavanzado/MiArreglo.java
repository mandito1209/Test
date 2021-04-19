/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.comportamientoavanzado;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author mandi
 */
public class MiArreglo {
    private ArrayList<Integer> numeros;
    private int capacidadInicial=10;
    private ArrayList<Integer> contador;

    public MiArreglo(ArrayList numeros) {
        this.numeros = numeros;
        contador=new ArrayList<Integer>(numeros.size());
    }
    
    public MiArreglo(int cantidad){
        numeros=new ArrayList<Integer>(cantidad);
        contador=new ArrayList<Integer>(cantidad);
        capacidadInicial=cantidad;
    }
    
    public void llenarValores(){
        Random rdm= new Random(11);
        for(int i=0;i<capacidadInicial;i++){
            int valor=rdm.nextInt(12);
            numeros.add(valor);
            contador.add(i, 0);
        }
    }
    
    public String verValores(){
        String cadena="";
        for(int i=0;i<numeros.size();i++){
            cadena+=numeros.get(i)+""+"\n";
        }
        return cadena;
    }
    
    public void repetidos()
    {
        for(int i=0; i<numeros.size();i++)
        {
            int valor=0;
            System.out.println(numeros.get(i));
            for(int j=0; j<contador.size();j++)
        {
            if(numeros.get(i)==numeros.get(j))
            {
                 valor++;
            }
        }
            System.out.println("se repite: "+valor);
        }
        
    }
}
