package Cafeteria;

public class Main {
    public static void main(String[] args) {

        // Crear objetos principales
        Cliente cliente = new Cliente("Juan");
        Cajero cajero = new Cajero("Carlos");
        Cocina cocina = new Cocina();

        // Simular flujo completo del sistema
        System.out.println(" SISTEMA DE PEDIDOS CAFETERIA ");

        cliente.hacerPedido(cajero, cocina);

        System.out.println(" FIN DEL PROCESO ");
    }
}
