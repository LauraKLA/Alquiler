package Alquiler;

public class Reparacion {
    
    private String fecha;
    private String motivo;
    private long costo;
    private int diasSinDisponibilidadVehiculo;

    public Reparacion(String fecha, String motivo, long costo, int diasSinDisponibilidadVehiculo) {
        this.fecha = fecha;
        this.motivo = motivo;
        this.costo = costo;
        this.diasSinDisponibilidadVehiculo = diasSinDisponibilidadVehiculo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public long getCosto() {
        return costo;
    }

    public void setCosto(long costo) {
        this.costo = costo;
    }

    public int getDiasSinDisponibilidadVehiculo() {
        return diasSinDisponibilidadVehiculo;
    }

    public void setDiasSinDisponibilidadVehiculo(int diasSinDisponibilidadVehiculo) {
        this.diasSinDisponibilidadVehiculo = diasSinDisponibilidadVehiculo;
    }
    
    public void muestraInfo(){
        System.out.println("La fecha de la reparacion es: " + fecha + 
                "\nEl motivo de la reparacion fue: " + motivo +
                "\nEl costo de la reparacion es: " + costo +
                "\nDías sin disponibilidad del vehículo: " + diasSinDisponibilidadVehiculo);
    }
}

