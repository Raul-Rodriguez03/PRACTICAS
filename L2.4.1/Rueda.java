public class Rueda {
    private int tamano;
    private String tipo;
    private String material;

    // Constructor
    public Rueda(int tamano, String tipo, String material) {
        this.tamano = tamano;
        this.tipo = tipo;
        this.material = material;
    }

    // Getters y Setters
    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}