/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoDomino;

import java.util.ArrayList;

/**
 *
 * @author MSI
 */
public class PruebaDomino {

    public static void main(String[] args) {
        Domino prueba1 = new Domino();
        prueba1.imprimir();
        System.out.println("---------Numero de fichas introducidas------------");

        //  FichaDomino prueba3 = new FichaDomino();
        System.out.println(prueba1.saberFichas());
        System.out.println("---------------------");

        FichaDomino fichaNueva1 = new FichaDomino(2, 4);
        FichaDomino fichaNueva2 = new FichaDomino(4, 5);
        System.out.println("Metemos la ficha 2:4");
        prueba1.meterFicha(fichaNueva1);
        System.out.println("---------Numero de fichas introducidas------------");

        //Al meter la ficha nueva podemos ver como se agranda el set
        System.out.println(prueba1.saberFichas());
        System.out.println("Esta vacia?");
        System.out.println(prueba1.estaVacia());

        System.out.println("---------------------");

        //Comprueba si las fichas estan introducidas
        System.out.println("Esta la ficha 2:4 en el conjunto?");

        System.out.println(prueba1.unaFicha(fichaNueva1));
        System.out.println("---------------------");
        System.out.println("Esta la ficha 4:5 en el conjunto?");
        System.out.println(prueba1.unaFicha(fichaNueva2));
        System.out.println("---------Numero de fichas introducidas------------");
        System.out.println(prueba1.saberFichas());
        System.out.println("---------Eliminando la ficha 2:4------------");
        prueba1.eliminarfichaConcreta(fichaNueva1);
        System.out.println("---------Numero de fichas introducidas------------");

        System.out.println(prueba1.saberFichas());
        System.out.println("Esta la ficha 2:4 en el conjunto?");
        System.out.println(prueba1.unaFicha(fichaNueva1));
        System.out.println("-------------------------");

        for (FichaDomino ficha : prueba1.sacarTodasLasFichas()) {
            System.out.println(ficha);
        }

    }

}
