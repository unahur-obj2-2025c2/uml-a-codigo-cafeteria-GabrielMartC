package ar.edu.unahur.obj2.composite.consumibles;

import java.util.ArrayList;
import java.util.List;

public class Combo implements Consumible{
    private String nombre;
    private Double precio;
    private List<Consumible> consumibles;

    

    public Combo(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.consumibles = new ArrayList<>();
    }

    

    public Combo(String nombre, Double precio, List<Consumible> consumibles) {
        this.nombre = nombre;
        this.precio = precio;
        this.consumibles = consumibles;
    }



    public void agregarProducto(Consumible c){
        consumibles.add(c);
    }

    public void eliminarProducto(Consumible c){
        consumibles.remove(c);
    }


    @Override
    public Double costo() {
        return Double.min(precio, this.costoDeConsumibles());
        // return costoDeConsumibles();
    }

    private Double costoDeConsumibles(){
        return consumibles.stream().mapToDouble(Consumible::costo).sum();
    }



    public String getNombre() {
        return nombre;
    }



    public Double getPrecio() {
        return precio;
    }



    public List<Consumible> getProductos() {
        return consumibles;
    }

    
}
