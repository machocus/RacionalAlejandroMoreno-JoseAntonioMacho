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
public class Racional {

    private int numerador;
    private int denominador;

    public Racional() {
        this.numerador = 1;
        this.denominador = 1;
    }

    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;

        if (denominador == 0) {
            this.denominador = 1;
        }
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public void imprimirConsola() {
        System.out.println("Número Relacional " + numerador + "/" + denominador);
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

    public void suma(Racional numero) {

        if (numero.getDenominador() == this.denominador) {
            this.numerador += numero.getNumerador();
        } else {
            //operaicon para poner el numerador de la fraccion
            this.numerador = (this.numerador * numero.getDenominador())//esto seria el a*d
                    + (this.denominador + numero.getNumerador());//esto seria el b*c
            //operaciones para el denominador
            //this.denominador = this.denominador * numero.getDenominador();
            //se resume en:
            this.denominador *= numero.getDenominador();
        }
        
        System.out.println("Suma: " + this.numerador + "/" + this.denominador);
    }
        public void resta(Racional numero) {

        if (numero.getDenominador() == this.denominador) {
            this.numerador -= numero.getNumerador();
        } else {
            //operaicon para poner el numerador de la fraccion
            this.numerador = (this.numerador * numero.getDenominador())//esto seria el a*d
                    - (this.denominador * numero.getNumerador());//esto seria el b*c
            //operaciones para el denominador
            //this.denominador = this.denominador * numero.getDenominador();
            //se resume en:
            this.denominador *= numero.getDenominador();
        }
        
        System.out.println("Resta: " + this.numerador + "/" + this.denominador);
    }
}
