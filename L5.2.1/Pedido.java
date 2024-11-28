import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Pedido implements Serializable {
    private String id;
    private Date fecha;
    private Cliente cliente;
    private List<Item> items;

    public Pedido(String id, Date fecha, Cliente cliente, List<Item> items) {
        this.id = id;
        this.fecha = fecha;
        this.cliente = cliente;
        this.items = items;
    }

    // Métodos sincronizados para manejar la concurrencia
    public synchronized void crearPedido() {
        // Lógica para crear un pedido
    }

    public synchronized void cancelarPedido() {
        // Lógica para cancelar un pedido
    }

    public synchronized void modificarPedido() {
        // Lógica para modificar un pedido
    }

    // Getters y setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
