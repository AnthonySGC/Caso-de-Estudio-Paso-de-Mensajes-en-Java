package Cafeteria;

public class Cajero {
    private String nombre;

    // Constructor
    public Cajero(String nombre) {
        this.nombre = nombre;
    }

    // Metodo para recibir el pedido del cliente
    public Pedido recibirPedido() {
        System.out.println(nombre + " está registrando el pedido del cliente...");

        // Crear nuevo pedido
        Pedido pedido = new Pedido();

        return pedido;
    }

    // Metodo para agregar productos al pedido
    public void agregarProductoPedido(Pedido pedido, Producto producto) {
        pedido.agregarProducto(producto);
        System.out.println(nombre + " agregó al pedido: " + producto.getNombre());
    }

    // Metodo para enviar pedido a cocina
    public void enviarCocina(Pedido pedido, Cocina cocina) {
        System.out.println(nombre + " envió el pedido a cocina.");
        cocina.prepararPedido(pedido);
    }

    // Metodo para notificar al cliente
    public void notificarCliente(Cliente cliente) {
        System.out.println(nombre + ": Su pedido está listo, " + cliente.getNombre() + ".");
    }
}
