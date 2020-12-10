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
        System.out.println("Número Racional: " + numerador + "/" + denominador);
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

    public Racional suma(Racional x) {

        if (x.getDenominador() == this.denominador) {
            this.numerador += x.getNumerador();
        } else {
            //operaicon para poner el numerador de la fraccion
            this.numerador = (this.numerador * x.getDenominador())//esto seria el a*d
                    + (this.denominador * x.getNumerador());//esto seria el b*c
            //operaciones para el denominador
            //this.denominador = this.denominador * numero.getDenominador();
            //se resume en:
            this.denominador *= x.getDenominador();
        }

        return new Racional(this.numerador, this.denominador);
    }

    public Racional resta(Racional x) {

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

        return new Racional(this.numerador, this.denominador);
    }

    public Racional producto(Racional x) {

        this.numerador *= x.getNumerador();//a*c
        this.denominador *= x.getDenominador();//b*d

        return new Racional(this.numerador, this.denominador);
    }

    public Racional division(Racional x) {

        this.numerador *= x.getDenominador();//a*d
        this.denominador /= x.getNumerador();//b*c

        System.out.println("Division: " + this.numerador + "/" + this.denominador);
        return new Racional(this.numerador, this.denominador);
    }

    public static boolean igualdad(Racional x, Racional y) {

        return (x.getNumerador() * y.getDenominador()) == (x.getDenominador() * y.getNumerador());
    }

    public Racional aleatorio() {
        Random random = new Random();
        this.numerador = random.nextInt();//si queremos que sea entre valores concretos debe ser (100) + 1
        this.denominador = random.nextInt() + 1;// para que no salga 0
        return new Racional(this.numerador, this.denominador);
    }

}
