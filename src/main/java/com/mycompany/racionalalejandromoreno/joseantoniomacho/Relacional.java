/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.racionalalejandromoreno.joseantoniomacho;

/**
 *
 * @author aguil
 */
public class Relacional {
    private int numerador;
    private int denominador;

    public Relacional() {
       this.numerador = 1;
       this.denominador = 1;
    }

    public Relacional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
        
        if (denominador==0) {
            this.denominador=1;
        }
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }
    
}
