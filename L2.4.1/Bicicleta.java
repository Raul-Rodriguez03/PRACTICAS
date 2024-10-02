// Clase Bicicleta
public class Bicicleta {
    private Rueda ruedaDelantera;
    private Rueda ruedaTrasera;
    private Cuadro cuadro;

    // Constructor
    public Bicicleta(Rueda ruedaDelantera, Rueda ruedaTrasera, Cuadro cuadro) {
        this.ruedaDelantera = ruedaDelantera;
        this.ruedaTrasera = ruedaTrasera;
        this.cuadro = cuadro;
    }

    // Getters y Setters
    public Rueda getRuedaDelantera() {
        return ruedaDelantera;
    }

    public void setRuedaDelantera(Rueda ruedaDelantera) {
        this.ruedaDelantera = ruedaDelantera;
    }

    public Rueda getRuedaTrasera() {
        return ruedaTrasera;
    }

    public void setRuedaTrasera(Rueda ruedaTrasera) {
        this.ruedaTrasera = ruedaTrasera;
    }

    public Cuadro getCuadro() {
        return cuadro;
    }

    public void setCuadro(Cuadro cuadro) {
        this.cuadro = cuadro;
    }

    public void mostrarInfo() {
        System.out.println("Bicicleta con cuadro de material: " + cuadro.getMaterial() + ", color: " + cuadro.getColor() + ", tamano: " + cuadro.getTamano());
        System.out.println("Rueda delantera de tamano: " + ruedaDelantera.getTamano() + ", tipo: " + ruedaDelantera.getTipo() + ", material: " + ruedaDelantera.getMaterial());
        System.out.println("Rueda trasera de tamano: " + ruedaTrasera.getTamano() + ", tipo: " + ruedaTrasera.getTipo() + ", material: " + ruedaTrasera.getMaterial());
    }

}