/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author darcy
 */
import java.util.Random;

public class Trenes {

    private idrive[] colasPasajeros;   // Colas de pasajeros asociadas a cada tren
    private idrive pasajerosEnEspera;  // Cola de pasajeros en espera
    private int[] estaciones;          // Representa la estación actual de cada tren

    public Trenes(int numTrenes) {
        
        colasPasajeros = new idrive[numTrenes];
        estaciones = new int[numTrenes];
        for (int i = 0; i < numTrenes; i++) {
            colasPasajeros[i] = new idrive();  // Inicializar cada cola de pasajeros asociada a un tren
            estaciones[i] = 0;                 // Todos los trenes comienzan en la estación 0
        }
        pasajerosEnEspera = new idrive();  // Inicializar la cola de pasajeros en espera
    }

    public void llegadaTren(int numeroTren) {
        
        System.out.println("El Tren " + numeroTren + " llegó a la Estación " + estaciones[numeroTren] + ".");

        // Subir 15 pasajeros al tren y dejar otros 15 en espera
        for (int i = 0; i < 15; i++) {
            int nuevoPasajero = 0;
            nuevoPasajero = generarPasajeroAleatorio();               // Simular la llegada de un nuevo pasajero
            colasPasajeros[numeroTren].insertarFinal(nuevoPasajero);  // Subir pasajero al tren
            System.out.println("Pasajero " + nuevoPasajero + " subió al Tren " + numeroTren);
        }

        // Dejar 15 pasajeros en espera
        for (int i = 0; i < 15; i++) {
            int nuevoPasajero = 0;
            nuevoPasajero = generarPasajeroAleatorio();  // Simular la llegada de un nuevo pasajero en espera
            pasajerosEnEspera.insertarFinal(nuevoPasajero);  // Poner pasajero en espera
            System.out.println("Pasajero " + nuevoPasajero + " en espera en la Estación " + estaciones[numeroTren]);
        }

        // Mover el tren a una estación aleatoria
        Random random = new Random();
        estaciones[numeroTren] = random.nextInt(5);  
        System.out.println("El Tren " + numeroTren + " se dirige a la Estación " + estaciones[numeroTren] + ".");
    }

    public boolean salidaTren() {
        for (int i = 0; i < colasPasajeros.length; i++) {
            if (!colasPasajeros[i].borrarInicio()) {
                colasPasajeros[i].borrarInicio();
                System.out.println("Pasajero " + colasPasajeros + " bajó del Tren " + i + " en la Estación " + estaciones[i]);

            }

        }
        return true;
    }

    private int generarPasajeroAleatorio() {
        // Simular la llegada de pasajeros aleatorios
        Random random = new Random();
        return random.nextInt(100);  // Números aleatorios como ID de pasajeros
    }
}