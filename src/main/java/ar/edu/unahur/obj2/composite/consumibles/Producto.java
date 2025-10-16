package ar.edu.unahur.obj2.composite.consumibles;

public abstract class Producto implements Consumible{
    protected String nombre;
    protected Double precioBase;

    public Producto(String nombre, Double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public Double costo() {
        return precioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    

    
    
}
