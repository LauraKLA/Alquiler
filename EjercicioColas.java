package Alquiler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EjercicioColas {

    public static void main(String[] args) throws IOException {

        BufferedReader cp = new BufferedReader(new InputStreamReader(System.in));

        Scanner entrada = new Scanner(System.in);
        int opcion;

        System.out.println("PROGRAMA MANEJO DE COLA CON UN VECTOR - FICHA ALQUILER");
        System.out.println("");
        do {

            String menu = "*** MENU PRINCIPAL ***\n"
                    + "1. Ingresar Registro\n"
                    + "2. Eliminar Registro\n"
                    + "3. Imprimir Registro\n"
                    + "4. Orden Asecentede\n"
                    + "5. Orden Desecentede\n"
                    + "6. Invertir Orden\n"
                    + "0. Salir\n"
                    + "SELECCIONE UNA OPCION: ";

            System.out.println(menu);
            opcion = Integer.parseInt(cp.readLine());

            switch (opcion) {

                case 1:
                    System.out.println("Ingrese el Id del vehículo: ");
                    int Id = Integer.parseInt(cp.readLine());
                    System.out.println("Ingrese los días de alquiler del vehículo: ");
                    String diasAlquiler = entrada.nextLine();
                    System.out.println("Ingrese el importe de alquiler del vehículo: ");
                    String importeAlquiler = entrada.nextLine();
                    System.out.println("Ingrese el kilometraje del vehículo: ");
                    String kilometraje = entrada.nextLine();
                    VectorCola.apilar("Id vehículo: " + Id + " " + "Días de alquiler: " + diasAlquiler + " " + "Importe de alquiler: " + importeAlquiler + " " + "Kilometraje: " + kilometraje);
                    break;
                case 2:
                    VectorCola.desapilar();
                    break;
                case 3:
                    VectorCola.imprimir();
                    break;
                case 4:
                    VectorCola.ascendente();
                    break;
                case 5:
                    VectorCola.descendente();
                    break;
                case 6:
                    VectorCola.invertir();
                    break;
                case 0:
                    System.out.println("FIN DEL PROGRAMA");
                    break;
            }
        } while (opcion != 0);
    }
}
