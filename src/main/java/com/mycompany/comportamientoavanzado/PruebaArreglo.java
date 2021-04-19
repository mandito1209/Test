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
public class PruebaArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MiArreglo ma=new MiArreglo(8);
        System.out.println(ma.verValores());
        ma.llenarValores();
        System.out.println(ma.verValores());
        ma.repetidos();
    }
    
}
