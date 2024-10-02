
// Clase Cuadro
public class Cuadro {
    private String material;
    private String color;
    private double tamano;

    // Constructor
    public Cuadro(String material, String color, double tamano) {
        this.material = material;
        this.color = color;
        this.tamano = tamano;
    }

    // Getters y Setters
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }
}