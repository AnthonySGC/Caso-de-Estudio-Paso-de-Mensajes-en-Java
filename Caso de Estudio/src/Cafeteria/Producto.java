package Cafeteria;

public class Producto {
    private String nombre;
    private double precio;

    // Constructor
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getter para obtener nombre
    public String getNombre() {
        return nombre;
    }

    // Getter para obtener precio
    public double getPrecio() {
        return precio;
    }
}
