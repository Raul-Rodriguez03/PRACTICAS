
// Clase derivada Autobus
class Autobus extends Vehiculo {
    private String route;

    public Autobus(String id, int capacity, String route) {
        super(id, capacity);
        this.route = route;
    }

    @Override
    public void start() {
        System.out.println("Autobús en marcha en la ruta " + route);
    }

    public void openDoors() {
        System.out.println("Puertas del autobús abiertas");
    }
}
