package Alquiler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Alquiler {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader Alquiler = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("¡Bienvenid@ al sistema!");
        System.out.println("");
        
        System.out.println("****Ficha registro de clientes****");
        System.out.println("");
        
        Cliente objCliente = new Cliente();
        objCliente.setId("1099876345");
        objCliente.setNombre("Paola");
        objCliente.setApellido("Rivera");
        objCliente.setLicencia("28923998608");
        objCliente.setProfesion("Contadora");
        System.out.println("Documento de identidad del usuario: " + objCliente.getId());
        System.out.println("Nombre del usuario: " + objCliente.getNombre());
        System.out.println("Apellido del usuario: " + objCliente.getApellido());
        System.out.println("Licencia del usuario: " + objCliente.getLicencia());
        System.out.println("Profesión del usuario: " + objCliente.getProfesion());
        System.out.println("");
        
        System.out.println("****Listado de vehículos****");
        System.out.println("");
        
        Vehiculo objVehiculo = new Vehiculo("D111", "Color rojo", "Mazda", 2015, "Disponible", "21/12/2014");
        System.out.println("El código del vehículo es: " + objVehiculo.getCodigo());
        System.out.println("La marca del vehículo es: " + objVehiculo.getMarca());
        System.out.println("El modelo del vehículo es: " + objVehiculo.getModelo());
        System.out.println("El estado del vehículo es: " + objVehiculo.getEstado());
        Reparacion objReparacion = new Reparacion("12/03/2022", "Falla en motor", 800000, 5);
        objReparacion.muestraInfo();
        System.out.println("");
        
        Vehiculo objVehiculo2 = new Vehiculo("D222", "Color azul", "Audi", 2018, "En reparación", "01/10/2017");
        System.out.println("El código del vehículo es: " + objVehiculo2.getCodigo());
        System.out.println("La marca del vehículo es: " + objVehiculo2.getMarca());
        System.out.println("El modelo del vehículo es: " + objVehiculo2.getModelo());
        System.out.println("El estado del vehículo es: " + objVehiculo2.getEstado());
        Reparacion objReparacion2 = new Reparacion("11/07/2021", "Fuga de aceite", 500000, 10);
        objReparacion2.muestraInfo();
        System.out.println("");
        
        Vehiculo objVehiculo3 = new Vehiculo("D333", "Color blanco", "Ford", 2020, "Alquilado", "16/04/2019");
        System.out.println("El código del vehículo es: " + objVehiculo3.getCodigo());
        System.out.println("La marca del vehículo es: " + objVehiculo3.getMarca());
        System.out.println("El modelo del vehículo es: " + objVehiculo3.getModelo());
        System.out.println("El estado del vehículo es: " + objVehiculo3.getEstado());
        Reparacion objReparacion3 = new Reparacion("No aplica", "No aplica", 0, 0);
        objReparacion3.muestraInfo();
        System.out.println("");
        
        System.out.println("****Ficha de alquiler****");
        System.out.println("");
        
        FichaAlquiler objFichaAlquiler = new FichaAlquiler("05/02/2023", "20", "200000", "120000", "Bueno" );
        System.out.println("La fecha de alquiler del vehículo es: " + objFichaAlquiler.getFechaAlquiler());
        System.out.println("Los día de alquiler del vehículo son: " + objFichaAlquiler.getDiasAlquiler());
        System.out.println("El valor del alquiler del vehículo es: " + objFichaAlquiler.getImporteAlquiler());
        System.out.println("El kilometraje del vehículo al momento del alquiler es: " + objFichaAlquiler.getKilometraje());
        System.out.println("El estado del venículo es: " + objFichaAlquiler.getEstado());
        
        
        
    }
    
}