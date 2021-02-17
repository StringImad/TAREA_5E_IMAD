/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traductor;

import java.util.ArrayList;

/**
 *
 * @author MSI
 */
public class Prueba {

    public static void main(String[] args) {

        Diccionario prueba1 = new Diccionario();
        String p1 = "dog", p2 = "perro";
        prueba1.insertarNuevaPalabra(p1, p2);
        prueba1.insertarNuevaPalabra("cat", "gato");
        prueba1.insertarNuevaPalabra("boat", "barco");
        prueba1.insertarNuevaPalabra("house", "casa");
        prueba1.insertarNuevaPalabra("friend", "amigo");

        prueba1.insertarNuevaPalabra("adsence", "anuncio");
        prueba1.insertarNuevaPalabra("girl", "chica");
        prueba1.insertarNuevaPalabra("men", "hombre");
        prueba1.insertarNuevaPalabra("door", "puerta");
        prueba1.insertarNuevaPalabra("hello", "hola");
        System.out.println("-------------------Imprimimos todo-----------------------");
        prueba1.imprimir();

        System.out.println("La traduccion de boat es: " + prueba1.traduccionPalabra("boat"));
        System.out.println("Borramos la palbara: girl");
        prueba1.borrarPalabra("girl");

        System.out.println("-------------------Imprimimos todo-----------------------");
        prueba1.imprimir();

        ArrayList<String> palabraIngles = new ArrayList();
        
        System.out.println(prueba1.listaPalabraEspañol());
        
        palabraIngles = prueba1.listaTodasClaves();

        for (int i = 0; i < palabraIngles.size(); i++) {
            System.out.println(palabraIngles.get(i));
        }

//// Imprimimos el Map con un Iterador
//        Iterator it = diccionario.keySet().iterator();
//        while (it.hasNext()) {
//            String key = (String) it.next();
//            System.out.println("Palabra: " + key + " -> Traduccion: " + diccionario.get(key));
//        }
    }
}
