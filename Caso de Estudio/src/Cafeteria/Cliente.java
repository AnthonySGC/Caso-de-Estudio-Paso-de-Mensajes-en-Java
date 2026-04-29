package Cafeteria;

public class Cliente {
    private String nombre;

    // Constructor
    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    // Metodo para hacer pedido
    public void hacerPedido(Cajero cajero, Cocina cocina) {
        System.out.println(nombre + " esta realizando un pedido...");

        // El cajero recibe y crea el pedido
        Pedido pedido = cajero.recibirPedido();

        // Agregar productos al pedido
        cajero.agregarProductoPedido(pedido, new Producto("Cafe", 2.50));
        cajero.agregarProductoPedido(pedido, new Producto("Sandwich", 5.00));

        // Enviar pedido a cocina
        cajero.enviarCocina(pedido, cocina);

        // Notificar cliente
        cajero.notificarCliente(this);
    }

    // Getter para obtener nombre
    public String getNombre() {
        return nombre;
    }
}
