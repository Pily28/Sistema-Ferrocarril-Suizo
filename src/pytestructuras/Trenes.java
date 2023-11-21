package pytestructuras;
        
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Trenes {
    Stack<Integer> trenes;
    Queue<Integer> personas;

    public Trenes() { //Constructor de la clase 
        this.trenes = new Stack<>(); // el this.trenes es la pila de los mismos
        this.personas = new LinkedList<>(); //estas son las personas en la fila
    }

    public void llegadaTren(int tren) {
        trenes.push(tren); //esto simula la llegada de los trenes
        System.out.println("El Tren " + tren + " llegó a la estación!!.");
    }

    public void abordarTren() {
        int tren =0;// este de aca simula a los pasajeros abordando el tren
        int pasajero =0;
        if (!trenes.isEmpty() && !personas.isEmpty()) {
             tren = trenes.pop();
             pasajero = personas.poll();
            System.out.println("Pasajero " + pasajero + " abordó el tren " + tren);
        } else {
            System.out.println("No hay trenes o pasajeros esperando.");
        }
    }

    public void agregarPasajero(int pasajero) {//y este nos simula a los pasajeros haciendo fila para el siguiente tren cuando llegue
        personas.offer(pasajero);
        System.out.println("Pasajero " + pasajero + " se unió a la cola para el tren.");
    }
}
// Compañeros no he podido hacer la parte de las ciudades porque no tengo muy claro como programarlo porque como estas no tienen codigo 
// no estoy muy seguro de como hacerlo pero este algoritmo de los trenes es bastante funcional pero faltarian las ciudades para que quede casi listo creo...
