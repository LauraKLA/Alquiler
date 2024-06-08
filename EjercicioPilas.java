package Alquiler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EjercicioPilas {

    public static void main(String[] args) throws IOException {

        BufferedReader cp = new BufferedReader(new InputStreamReader(System.in));

        Scanner entrada = new Scanner(System.in);
        int opcion;

        System.out.println("PROGRAMA MANEJO DE PILA CON UN VECTOR - FICHA CLIENTE");
        System.out.println("");
        do {

            String menu = "*** MENU PRINCIPAL ***\n"
                    + "1. Ingresar Cliente\n"
                    + "2. Eliminar Cliente\n"
                    + "3. Imprimir Cliente\n"
                    + "4. Orden Asecentede\n"
                    + "5. Orden Desecentede\n"
                    + "6. Invertir Orden\n"
                    + "0. Salir\n"
                    + "SELECCIONE UNA OPCION: ";

            System.out.println(menu);
            opcion = Integer.parseInt(cp.readLine());

            switch (opcion) {

                case 1:
                    System.out.println("Digite el Id a ingresar");
                    int Id = Integer.parseInt(cp.readLine());
                    System.out.println("Digite el nombre a ingresar");
                    String nombre = entrada.nextLine();
                    System.out.println("Digite el apellido a ingresar");
                    String apellido = entrada.nextLine();
                    System.out.println("Digite el telefono a ingresar");
                    String telefono = entrada.nextLine();
                    VectorPila.apilar("Id: " + Id + " " + "Nombre: " + nombre + " " + "Apellido: " + apellido + " " + "Telefono: " + telefono);
                    break;
                case 2:
                    VectorPila.desapilar();
                    break;
                case 3:
                    VectorPila.imprimir();
                    break;
                case 4:
                    VectorPila.ascendente();
                    break;
                case 5:
                    VectorPila.descendente();
                    break;
                case 6:
                    VectorPila.invertir();
                    break;
                case 0:
                    System.out.println("FIN DEL PROGRAMA");
                    break;
            }
        } while (opcion != 0);
    }
}
