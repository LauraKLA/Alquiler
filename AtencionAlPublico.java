package Alquiler;

public class AtencionAlPublico extends Empleado{
    private int comision;
    
    public AtencionAlPublico(int codigo, String nombre, int comision){
    super(codigo, nombre);
    this.comision = comision;
    
    }
}
