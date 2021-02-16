/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoDomino;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author MSI
 */
public class FichaDomino {

    private int parteIzquierda = 0;
    private int parteDerecha = 0;
//Creamos constructor  parametrizado, en el que se pasarán como parámetros el valor de ambas partes.

    public FichaDomino() {
        this.parteIzquierda = 0;
        this.parteDerecha = 0;

    }

    public FichaDomino(int a, int b) {
        // Si alguno de los valores pasados no es válido pero es par, se asignará el valor seis

        this.parteDerecha = valorPosible(b);
        //Si no es válido y es impar, se asignará a esa parte el valor cinco.

        this.parteIzquierda = valorPosible(a);

    }

    private int valorPosible(int a) {

        if (a < 0 || a > 6) {
            if (a % 2 == 0) {
                a = 6;
            } else {
                a = 5;
            }
        }

        return a;
    }

    //La clase incluye un método que devuelve la suma los valores de ambas partes de una ficha
    public int getValorTotal() {
        return (int) (parteIzquierda + parteDerecha);
    }

    //generará una ficha aleatoriamente y la devolverá. 
    public static FichaDomino generaFichaAleatoria() {

        // Creamos un random
        Random randomAleatorio = new Random();

        int parteIzquierda = randomAleatorio.nextInt(7);
        int parteDerecha = randomAleatorio.nextInt(7);
        FichaDomino aleatorioNuevo = new FichaDomino(parteIzquierda, parteDerecha);

        return aleatorioNuevo;
    }

//metodos getter and setter
    public int getParteIzquierda() {
        return parteIzquierda;
    }

    public int getParteDerecha() {
        return parteDerecha;
    }

    public void setParteIzquierda(int parteIzquierda) {
        this.parteIzquierda = valorPosible(parteIzquierda);
    }

    public void setParteDerecha(int parteDerecha) {
        this.parteDerecha = valorPosible(parteDerecha);
    }
//uso del método toString(), usando el siguiente formato: [ | ]

    @Override
    public String toString() {
        String correccion = "[" + parteIzquierda + "|" + parteDerecha + "]";
        //remplaza los 0 por un espacio, simulando las blancas
        return correccion.replaceAll("0", " ");

    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.parteIzquierda;
        hash = 79 * hash + this.parteDerecha;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FichaDomino other = (FichaDomino) obj;
        if (this.parteIzquierda != other.parteIzquierda) {
            return false;
        }
        if (this.parteDerecha != other.parteDerecha) {
            return false;
        }
        return true;
    }

}
