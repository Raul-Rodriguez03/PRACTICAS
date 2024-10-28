
public class Ave extends Animal {
    private String tipoDePlumas;
    private boolean puedeVolar;

    public Ave(String nombre, int edad, double peso, String tipoDePlumas, boolean puedeVolar) {
        super(nombre, edad, peso);
        this.tipoDePlumas = tipoDePlumas;
        this.puedeVolar = puedeVolar;
    }

    // Getters y Setters
    public String getTipoDePlumas() {
        return tipoDePlumas;
    }

    public void setTipoDePlumas(String tipoDePlumas) {
        this.tipoDePlumas = tipoDePlumas;
    }

    public boolean isPuedeVolar() {
        return puedeVolar;
    }

    public void setPuedeVolar(boolean puedeVolar) {
        this.puedeVolar = puedeVolar;
    }

    @Override
    public String toString() {
        return "Ave{" +
                "tipoDePlumas='" + tipoDePlumas + '\'' +
                ", puedeVolar=" + puedeVolar +
                ", " + super.toString() +
                '}';
    }
}
 
