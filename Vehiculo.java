package Alquiler;

public class Vehiculo {
    private String codigo;
    private String descripcion;
    private String marca;
    private int modelo;
    private String estado;
    private String fechaFeabricacion;

    public Vehiculo(String codigo, String descripcion, String marca, int modelo, String estado, String fechaFeabricacion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.marca = marca;
        this.modelo = modelo;
        this.estado = estado;
        this.fechaFeabricacion = fechaFeabricacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaFeabricacion() {
        return fechaFeabricacion;
    }

    public void setFechaFeabricacion(String fechaFeabricacion) {
        this.fechaFeabricacion = fechaFeabricacion;
    }

  
    
}

