/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoDomino;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author MSI
 */
public class Domino {

    private Set<FichaDomino> dominoPrueba;

    public Domino() {
        dominoPrueba = new HashSet<>();
        final int NUMFICHADOMINO = 6;

        for (int i = 0; i <= NUMFICHADOMINO; i++) {
            for (int j = i; j <= NUMFICHADOMINO; j++) {
                dominoPrueba.add(new FichaDomino(i, j));
            }
        }

    }

    public void imprimir() {
        dominoPrueba.forEach(System.out::println);

    }
//1. Saber el número de fichas que tiene.

    public int saberFichas() {
        int numeroDeFichas = dominoPrueba.size();
        return numeroDeFichas;
    }
//2. Introducir una ficha.

    public void meterFicha(FichaDomino nuevaFicha) {

        if (!dominoPrueba.contains(nuevaFicha)) {
            dominoPrueba.add(nuevaFicha);
        }

    }
//  3. Saber si hay fichas dentro.

    public boolean estaVacia() {
//        if (
        return dominoPrueba.isEmpty();

//                == true) {
//            System.out.println("No hay fichas dentro");
//
//        } else {
//            System.out.println("Hay fichas dentro");
//        }
    }

//4. Saber si una ficha está en el conjunto.
    //usamos contains para ver si lo contiene
    public boolean unaFicha(FichaDomino fichaComprobar) {
        if (dominoPrueba.contains(fichaComprobar)) {
            return true;
        } else {
            return false;
        }

//        {
//            System.out.println("Esta ficha ya esta introducida");
//        } 
//        else {
//            System.out.println("Esta ficha no esta introducida");
//        }
    }

//4. Sacar todas las fichas, en forma de ArrayList.
    public ArrayList<FichaDomino> sacarTodasLasFichas() {
        ArrayList<FichaDomino> lista = new ArrayList<>(dominoPrueba);

//       for (FichaDomino fichaDomino : dominoPrueba) {
//           lista.add(fichaDomino);
//       }
        return lista;
    }

//5. Eliminar una ficha concreta. 
    //reutilizo el codigo anterior y borramos
    public void eliminarfichaConcreta(FichaDomino fichaComprobar) {
        if (dominoPrueba.contains(fichaComprobar)) {
            dominoPrueba.remove(fichaComprobar);
        }
    }

    public Set<FichaDomino> getDominoPrueba() {
        return dominoPrueba;
    }

    @Override
    public String toString() {
        return "Domino{" + "dominoPrueba=" + dominoPrueba + '}';
    }

}
