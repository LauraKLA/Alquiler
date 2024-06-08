package Alquiler;

public class FichaAlquiler {
    
    private String Id;
    private String diasAlquiler;
    private String importeAlquiler;
    private String kilometraje;
    private String estado;

    public FichaAlquiler(String Id, String diasAlquiler, String importeAlquiler, String kilometraje, String estado) {
        this.Id = Id;
        this.diasAlquiler = diasAlquiler;
        this.importeAlquiler = importeAlquiler;
        this.kilometraje = kilometraje;
        this.estado = estado;
    }

    public String getFechaAlquiler() {
        return Id;
    }

    public void setFechaAlquiler(String fechaAlquiler) {
        this.Id = fechaAlquiler;
    }

    public String getDiasAlquiler() {
        return diasAlquiler;
    }

    public void setDiasAlquiler(String diasAlquiler) {
        this.diasAlquiler = diasAlquiler;
    }

    public String getImporteAlquiler() {
        return importeAlquiler;
    }

    public void setImporteAlquiler(String importeAlquiler) {
        this.importeAlquiler = importeAlquiler;
    }

    public String getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(String kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
