/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traductor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author MSI
 */
public class Diccionario {

    private Map<String, String> diccionario;
//    Set<String> diccionarioConjunto = diccionario.keySet();

    public Diccionario() {
        //
        diccionario = new TreeMap<>();

    }
    //Existirá un método
    //que servirá para guardar una entrada y 
    //recibirá dos palabras (palabraIngles, palabraEspañol)

    public void insertarNuevaPalabra(String palabraIngles, String palabraEspanol) {
        diccionario.put(palabraIngles, palabraEspanol);
    }

    //Se deben poder borrar entradas y modificar entradas ya creadas, 
    public void borrarPalabra(String palabraIngles) {
        diccionario.remove(palabraIngles);
    }

    public void modificarPalabra(String palabraIngles, String palabraActualizadaEspanol) {
        diccionario.put(palabraIngles, palabraActualizadaEspanol);
    }

    public String traduccionPalabra(String palabraIngles) {
        return diccionario.get(palabraIngles);
    }

    public void imprimir() {
        for (String key : diccionario.keySet()) {
            System.out.println("La palabara en ingles clave: " + key
                    + "  Español valor: " + diccionario.get(key));
        }
    }

    //CORRECCION
    public ArrayList<String> listaTodasClaves() {
        ArrayList<String> lista = new ArrayList<>(diccionario.keySet());

        return lista;
    }

    public ArrayList<String> listaPalabraEspañol() {
        ArrayList<String> lista = new ArrayList<>(diccionario.values());

        return lista;
    }

    //así como realizar la traducción de una palabra inglesa dada.????
//    public void traduccionDelIngles(String palabraIngles){
//      palabraIngles.put(diccionario.get(palabraIngles.));
//    }
    // También debe haber dos métodos
    // : una para crear una lista de palabras en inglés
//    public void listaPalabrasIngles() {
//        System.out.println("  ----  Lista de claves únicas -----");
//        diccionarioConjunto.forEach(System.out::println);
//    }
    // otro para obtener las palabras en español.
}
