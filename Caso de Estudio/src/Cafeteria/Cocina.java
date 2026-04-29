package Cafeteria;

public class Cocina {

    // Metodo para preparar pedido
    public void prepararPedido(Pedido pedido) {
        System.out.println("Cocina recibio el pedido.");

        // Cambiar estado a en preparacion
        pedido.cambiarEstado("En preparacion");
        System.out.println("Pedido en estado: " + pedido.getEstado());

        // Simulacion de preparacion
        System.out.println("Cocina esta preparando el pedido...");

        // Cambiar estado a listo
        pedido.cambiarEstado("Listo");
        System.out.println("Pedido en estado: " + pedido.getEstado());
    }
}
