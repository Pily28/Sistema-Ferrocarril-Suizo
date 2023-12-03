/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.Random;
import java.util.Vector;

/**
 *
 * @author darcy
 */
public class FilaPasajeros {
    public Vector<Pasajero> fila = new Vector();

    public void agregarNuevosPasajeros(){
        Random rn = new Random();
        for (int i = 0; i < 15; i++) {
            fila.add(new Pasajero(rn.nextInt(5) + 1));
        }
    }
    
    private String devolverPasajero(int posicion){
        return String.format("Pasajero %d: Ciudad: %s", posicion + 1, fila.get(posicion).ciudad());
    }
    
    public String devolverPasajeros(){
        String pasajeros = "";
        for (int i = 0; i < fila.size(); i++) {
            pasajeros += devolverPasajero(i) + "\n";
        }
        return pasajeros;
    }
    
    public int retirarPasajerosPorCiudad(int ciudad){
        int cantidad = 0;
        for (int i = 0; i < fila.size(); i++) {
            if(fila.get(i).ciudad == ciudad){
                fila.remove(i);
                i --;
                cantidad++;
            }
        }
        return cantidad;
    }
}
