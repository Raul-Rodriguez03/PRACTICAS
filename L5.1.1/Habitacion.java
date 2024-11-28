import java.io.Serializable;

public class Habitacion implements Serializable {
    private String id;
    private int numero;
    private String tipo;
    private double precio;

    public Habitacion(String id, int numero, String tipo, double precio) {
        this.id = id;
        this.numero = numero;
        this.tipo = tipo;
        this.precio = precio;
    }

    // Getters y setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

