/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author XPC
 */
public class idrive {

    private nodo Lista;

    public idrive() {
        this.Lista = null;
    }

    public boolean insertarInicio(int dato) {
        nodo nuevo = new nodo();
        nuevo.anterior = null;
        nuevo.siguiente = null;
        nuevo.dato = dato;
        try {
            if (this.Lista == null) {
                this.Lista = nuevo;
            } else {
                nuevo.siguiente = this.Lista;
                this.Lista.anterior = nuevo;
                this.Lista = nuevo;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean insertarFinal(int dato) {
        nodo nuevo = new nodo();
        nuevo.anterior = null;
        nuevo.siguiente = null;
        nuevo.dato = dato;
        try {
            if (this.Lista == null) {
                this.Lista = nuevo;
            } else {
                nodo aux = this.Lista;
                while (aux.siguiente != null) {
                    aux = aux.siguiente;
                }
                aux.siguiente = nuevo;
                nuevo.anterior = aux;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean insertarMedio(int dato) {
        nodo nuevo = new nodo();
        nuevo.anterior = null;
        nuevo.siguiente = null;
        nuevo.dato = dato;
        try {
            if (this.Lista == null) {
                this.Lista = nuevo;
            } else {
                nodo aux = this.Lista;
                while (aux != aux.anterior || aux.siguiente != null) {
                    aux = aux.siguiente;
                }

                if (aux == aux.anterior) {
                    nuevo.siguiente = aux.siguiente;
                    aux.siguiente = nuevo;
                    nuevo.anterior = aux;
                    return true;
                } else {
                    return false;
                }
            }
            return true;

        } catch (Exception e) {
            return false;
        }

    }

    public boolean borrarInicio() {
        try {
            if (this.Lista != null) {
                if (this.Lista.siguiente != null) {
                    this.Lista.siguiente.anterior = null;
                    this.Lista = this.Lista.siguiente;
                } else {
                    this.Lista = null;
                }
                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            return false;
        }
    }
}


    



