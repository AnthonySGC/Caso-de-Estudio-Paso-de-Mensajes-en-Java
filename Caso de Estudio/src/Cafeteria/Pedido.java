package Cafeteria;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<Producto> productos;
    private String estado;

    // Constructor
    public Pedido() {
        productos = new ArrayList<>();
        estado = "Registrado";
    }

    // Metodo para agregar productos
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    // Metodo para cambiar estado
    public void cambiarEstado(String nuevoEstado) {
        estado = nuevoEstado;
    }

    // Getter para obtener estado
    public String getEstado() {
        return estado;
    }

    // Metodo para mostrar productos del pedido
    public void mostrarProductos() {
        System.out.println("Productos en el pedido:");

        for (Producto producto : productos) {
            System.out.println("- " + producto.getNombre() + " : $" + producto.getPrecio());
        }
    }
}
