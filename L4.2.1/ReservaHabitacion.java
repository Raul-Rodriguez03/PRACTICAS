import java.util.Date;
class ReservaHabitacion extends Reserva {
    private int numHabitacion;

    public ReservaHabitacion(String id, Date fecha, int numHabitacion) {
        super(id, fecha);
        this.numHabitacion = numHabitacion;
    }

    @Override
    public void crearReserva() {
        System.out.println("Reserva de habitación creada para la habitación " + numHabitacion);
    }

    public void asignarHabitacion() {
        System.out.println("Habitación " + numHabitacion + " asignada");
    }
}
