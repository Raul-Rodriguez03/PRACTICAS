// Clase derivada Tren
class Tren extends Vehiculo {
    private String line;

    public Tren(String id, int capacity, String line) {
        super(id, capacity);
        this.line = line;
    }

    @Override
    public void start() {
        System.out.println("Tren en marcha en la línea " + line);
    }

    public void signalDeparture() {
        System.out.println("Tren señalando salida");
    }
}
