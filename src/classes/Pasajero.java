/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author darcy
 */
public class Pasajero {
    public int ciudad;

    public Pasajero(int ciudad) {
        this.ciudad = ciudad;
    }
    
    public String ciudad(){
        switch (ciudad) {
            case 1 -> {
                return "Zurich";
            }
            case 2 -> {
                return "Basilea";
            }
            case 3 -> {
                return "Ginebra";
            }
            case 4 -> {
                return "Berna";
            }
            case 5 -> {
                return "Lucerna";
            }
        }
        return "";
    }
}
