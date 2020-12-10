/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.racionalalejandromoreno.joseantoniomacho;

import java.util.Random;

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

    public void suma(Racional x) {

        if (x.getDenominador() == this.denominador) {
            this.numerador += x.getNumerador();
        } else {
            //operaicon para poner el numerador de la fraccion
            this.numerador = (this.numerador * x.getDenominador())//esto seria el a*d
                    + (this.denominador + x.getNumerador());//esto seria el b*c
            //operaciones para el denominador
            //this.denominador = this.denominador * numero.getDenominador();
            //se resume en:
            this.denominador *= x.getDenominador();
        }

        System.out.println("Suma: " + this.numerador + "/" + this.denominador);
    }

    public void resta(Racional x) {

        if (x.getDenominador() == this.denominador) {
            this.numerador -= x.getNumerador();
        } else {
            //operaicon para poner el numerador de la fraccion
            this.numerador = (this.numerador * x.getDenominador())//esto seria el a*d
                    - (this.denominador * x.getNumerador());//esto seria el b*c
            //operaciones para el denominador
            //this.denominador = this.denominador * numero.getDenominador();
            //se resume en:
            this.denominador *= x.getDenominador();
        }

        System.out.println("Resta: " + this.numerador + "/" + this.denominador);
    }

    public void producto(Racional x) {

        this.numerador *= x.getNumerador();//a*c
        this.denominador *= x.getDenominador();//b*d

        System.out.println("Multiplicacion: " + this.numerador + "/" + this.denominador);
    }

    public void division(Racional x) {

        this.numerador *= x.getDenominador();//a*d
        this.denominador /= x.getNumerador();//b*c

        System.out.println("Division: " + this.numerador + "/" + this.denominador);
    }

    public void igualdad(Racional x, Racional y) {

        if (x.getNumerador() * y.getDenominador()/* a*d */
                == x.getDenominador() * y.getNumerador()) { //b*c
            System.out.println("Son equivalentes");
        } else {
            System.out.println("No son equivalentes");
        }
    }

    public int aleatorio() {
        Random random = new Random();
        this.numerador = random.nextInt();//si queremos que sea entre valores concretos debe ser (100) + 1
        this.denominador = random.nextInt() + 1;// para que no salga 0
        return this.numerador / this.denominador;
    }
}
