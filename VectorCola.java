package Alquiler;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class VectorCola {

    static int tope = 0;
    static int tamaño = 5;
    static String vecCola[] = new String[10];

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

    public static void apilar(String kilometraje) {
        if (llena() == true) {
            System.out.println("No hay espacio disponible");
        } else {
            vecCola[tope] = kilometraje;
            tope = tope + 1;
            System.out.println("El elemento fue ingresado");
        }
    }

    public static void desapilar() {
        if (vacia() == true) {
            System.out.println("La cola esta vacía");
        } else {

            int Primero;
            System.out.println("El elemento " + vecCola[tope - tope] + " fue eliminado");
            for (int i = 0; i < tope; i++) {

            }
            Primero = 0;

            for (int i = Primero; i < tope; i++) {
                vecCola[i] = vecCola[i + 1];
                
            }

        }
    }

    public static void ascendente() {
        if (vacia() == true) {

            System.out.println("La cola esta vacía");
        } else {

            for (int i = 0; i < (tope - 1); i++) {
                for (int j = 0; j < (tope - 1); j++) {

                    if (vecCola[j].compareTo(vecCola[j + 1]) > 0) {
                        String aux = vecCola[j];
                        vecCola[j] = vecCola[j + 1];
                        vecCola[j + 1] = aux;

                    }
                }
            }
            System.out.println("Cola ordenada de forma ascendente");
            for (int i = 0; i < tope; i++) {
                System.out.println("El Registro " + (i + 1) + " es: " + vecCola[i]);
            }
        }

    }

    public static void descendente() {
        if (vacia() == true) {

            System.out.println("La cola esta vacía");
        } else {

            for (int i = 0; i < (tope - 1); i++) {
                for (int j = 0; j < (tope - 1); j++) {

                    if (vecCola[j].compareTo(vecCola[j + 1]) > 0) {
                        String aux = vecCola[j];
                        vecCola[j] = vecCola[j + 1];
                        vecCola[j + 1] = aux;

                    }
                }
            }
            System.out.println("Cola ordenada de forma descendente");
            for (int i = (tope - 1); i >= 0; i--) {
                System.out.println("El Registro " + (i + 1) + " es: " + vecCola[i]);
            }
        }

    }

    public static void invertir() {

        if (vacia() == true) {

            System.out.println("La cola esta vacía");
        } else {

            String ultimo = vecCola[tope - 1];

            for (int i = tope + 1; i >= 0; i--) {
                vecCola[i + 1] = vecCola[i];
            }
            vecCola[0] = ultimo;

            System.out.println("Cola inventida");
            for (int i = 0; i < tope; i++) {
                System.out.println("El Registro " + (i + 1) + " es: " + vecCola[i]);

            }

        }
    }

    public static void imprimir() {
        if (vacia() == true) {
            System.out.println("La cola esta vacía");
        } else {
            System.out.println("** EL RESULTADO DE SU SELECCION ES: **");
            for (int i = 0; i < tope; i++) {
                {

                    System.out.println("El Registro " + (i + 1) + " es = " + vecCola[i]);

                }
            }
        }
    }

}
