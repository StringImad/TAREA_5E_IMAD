/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loteria;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author MSI
 */
public class Loteria {
//Implementa en una estructura de tipo map un sistema de almacenamiento de números de décimos de lotería nacional y su premio asociado.
//Inserta en la estructura 1000 registros, inventando los números de los décimos y el premio asociado.
//Ten en cuenta que el número de décimo debe contemplar ceros a la izquierda (09876, 00234, ...).
//La aplicación debe ofrecer al usuario la posibilidad de consultar por número de décimo el premio obtenido

    private Map<String, String> loteria;
    private String[] arrayCreado = new String[1000];

    public Loteria(Map<String, String> loteria) {
        loteria = new TreeMap<>();
    }

    public void rellenarArrayCreado() {
        for (int i = 0; i < arrayCreado.length; i++) {
            int valor = (int) Math.floor(Math.random() * 5 + 1);

            String numCadena = valor + "";
            arrayCreado[i] = numCadena;
        }
    }

    public void insertarRegistros() {
    }

}
