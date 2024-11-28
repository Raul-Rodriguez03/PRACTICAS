import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PedidosPrueba {
    public static void main(String[] args) {
        // Crear clientes
        Cliente cliente1 = new Cliente("C1", "Juan Pérez", "juan@example.com", "123456789");
        Cliente cliente2 = new Cliente("C2", "Ana Gómez", "ana@example.com", "987654321");

        // Crear items
        Item item1 = new Item("I1", "Pizza", 12.99);
        Item item2 = new Item("I2", "Hamburguesa", 8.99);
        Item item3 = new Item("I3", "Ensalada", 6.99);

        // Crear listas de items
        List<Item> itemsPedido1 = new ArrayList<>();
        itemsPedido1.add(item1);
        itemsPedido1.add(item2);

        List<Item> itemsPedido2 = new ArrayList<>();
        itemsPedido2.add(item2);
        itemsPedido2.add(item3);

        // Crear pedidos
        Pedido pedido1 = new Pedido("P1", new Date(), cliente1, itemsPedido1);
        Pedido pedido2 = new Pedido("P2", new Date(), cliente2, itemsPedido2);

        // Crear hilos para simular concurrencia
        Thread hilo1 = new Thread(() -> {
            pedido1.crearPedido();
            System.out.println("Pedido 1 creado por " + pedido1.getCliente().getNombre());
        });

        Thread hilo2 = new Thread(() -> {
            pedido2.crearPedido();
            System.out.println("Pedido 2 creado por " + pedido2.getCliente().getNombre());
        });

        // Iniciar hilos
        hilo1.start();
        hilo2.start();

        // Esperar a que los hilos terminen
        try {
            hilo1.join();
            hilo2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Mostrar detalles de los pedidos
        mostrarDetallesPedido(pedido1);
        mostrarDetallesPedido(pedido2);
    }

    private static void mostrarDetallesPedido(Pedido pedido) {
        System.out.println("Detalles del Pedido ID: " + pedido.getId());
        System.out.println("Fecha: " + pedido.getFecha());
        System.out.println("Cliente: " + pedido.getCliente().getNombre());
        System.out.println("Items:");
        for (Item item : pedido.getItems()) {
            System.out.println(" - " + item.getNombre() + ": $" + item.getPrecio());
        }
        System.out.println("-------------------------------");
    }
}
