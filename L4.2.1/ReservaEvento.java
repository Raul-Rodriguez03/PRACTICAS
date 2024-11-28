// Clase derivada ReservaEvento
import java.util.Date;
class ReservaEvento extends Reserva {
    private int numSala;

    public ReservaEvento(String id, Date fecha, int numSala) {
        super(id, fecha);
        this.numSala = numSala;
    }

    @Override
    public void crearReserva() {
        System.out.println("Reserva de evento creada para la sala " + numSala);
    }

    public void asignarSala() {
        System.out.println("Sala " + numSala + " asignada");
    }
}
