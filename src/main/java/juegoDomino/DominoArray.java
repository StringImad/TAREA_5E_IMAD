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
public class DominoArray {

    private ArrayList<FichaDomino> fichasCompletas = new ArrayList<>();

    public ArrayList sacarTodasLasFichasDomino() {
             Domino defecto = new Domino();

        for (FichaDomino fichas : defecto.getDominoPrueba()) {
            fichasCompletas.add(fichas);
        }

        return fichasCompletas;
    }

   
}
