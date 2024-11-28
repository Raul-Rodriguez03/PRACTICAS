// Clase derivada Tranvia
class Tranvia extends Vehiculo {
    private String track;

    public Tranvia(String id, int capacity, String track) {
        super(id, capacity);
        this.track = track;
    }

    @Override
    public void start() {
        System.out.println("Tranvía en marcha en la vía " + track);
    }

    public void activateBell() {
        System.out.println("Campana del tranvía activada");
    }
}



