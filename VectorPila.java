package Alquiler;

import java.util.Arrays;
import java.util.List;

public class VectorPila {

    static int tope = 0;
    static int tamaño = 5;
    static String vecPila[] = new String[10];

    public static boolean llena() {//Para Validar que el vector no este lleno//
        if (tope >= tamaño) {
            return true;

        } else {
            return false;
        }
    }

    public static boolean vacia() {//Para Validar que el vector no este vacio//
        if (tope == 0) {
            return true;

        } else {
            return false;
        }

    }

    public static void apilar(String nombre) {
        if (llena() == true) {
            System.out.println("No hay espacio disponible");
        } else {
            vecPila[tope] = nombre;
            tope = tope + 1;
            System.out.println("El elemento fue ingresado");
        }
    }

    public static void desapilar() {
        if (vacia() == true) {
            System.out.println("La pila esta vacía");
        } else {
            System.out.println("El elemento " + vecPila[tope - 1] + " fue eliminado");
            tope = tope - 1;
        }
    }

    public static void ascendente() {
        if (vacia() == true) {

            System.out.println("La pila esta vacía");
        } else {

            for (int i = 0; i < (tope - 1); i++) {
                for (int j = 0; j < (tope - 1); j++) {

                    if (vecPila[j].compareTo(vecPila[j + 1]) > 0) {
                        String aux = vecPila[j];
                        vecPila[j] = vecPila[j + 1];
                        vecPila[j + 1] = aux;

                    }
                }
            }
            System.out.println("Pila ordenada de forma ascendente");
            for (int i = 0; i < tope; i++) {
                System.out.println("El Usuario " + (i + 1) + " es: " + vecPila[i]);
            }
        }

    }

    public static void descendente() {
        if (vacia() == true) {

            System.out.println("La pila esta vacía");
        } else {

            for (int i = 0; i < (tope - 1); i++) {
                for (int j = 0; j < (tope - 1); j++) {

                    if (vecPila[j].compareTo(vecPila[j + 1]) > 0) {
                        String aux = vecPila[j];
                        vecPila[j] = vecPila[j + 1];
                        vecPila[j + 1] = aux;

                    }
                }
            }
            System.out.println("Pila ordenada de forma descendente");
            for (int i = (tope - 1); i >= 0; i--) {
                System.out.println("El Usuario " + (i + 1) + " es: " + vecPila[i]);
            }
        }

    }

    public static void invertir() {

       if (vacia() == true) {

            System.out.println("La pila esta vacía");
        } else {
           
           String ultimo = vecPila[tope-1];

            for (int i = tope+1; i>=0; i--) {
                vecPila[i+1] = vecPila[i];
            }
            vecPila[0] = ultimo;
            

            System.out.println("Pila inventida");
            for (int i = 0; i < tope; i++){
                System.out.println("El Usuario " + (i + 1) + " es: " + vecPila[i]);

            }

        }
    }

    public static void imprimir() {
        if (vacia() == true) {
            System.out.println("La pila esta vacía");
        } else {
            System.out.println("** EL RESULTADO DE SU SELECCION ES: **");
            for (int i = 0; i < tope; i++) {
                {
                    
                    System.out.println("El Usuario " + (i + 1) + " es = " + vecPila[i]);

                }
            }
        }
    }

}
