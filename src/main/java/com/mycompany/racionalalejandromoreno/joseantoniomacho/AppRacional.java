/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.racionalalejandromoreno.joseantoniomacho;

/**
 *
 * @author aleja
 */
public class AppRacional {
    public static void main(String[] args) {
        Racional z = new Racional(4, 5);
        Racional k = new Racional(3, 4);
        Racional ramdom = new Racional();//como es ramdon, no le hacen falta parametros
        
        
        ramdom.aleatorio();//metodo para ramdomizar los valores del racional
        
        System.out.println("Numeros:\n");
        z.imprimirConsola();//imprime por pantalla
        k.imprimirConsola();//imprime por pantalla
        ramdom.imprimirConsola();//imprime por pantalla
        
        System.out.println("Igualdad:\n");
        Racional.igualdad(z, k); //Imprime por pantalla la igualdad de z entre k
        
        System.out.println("Suma:\n");
        z.suma(k).imprimirConsola();//z.suma(k) es un racional, entonces imprimimos eser racional por consola
        
        System.out.println("Division:\n");
        Racional division = z.division(k);
        division.imprimirConsola();
    }
}
