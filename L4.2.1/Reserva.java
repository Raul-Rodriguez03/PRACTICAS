import java.util.Date;
abstract class Reserva {
    private String id;
    private Date fecha;

    public Reserva(String id, Date fecha) {
        this.id = id;
        this.fecha = fecha;
    }

    public abstract void crearReserva();

    public void cancelarReserva() {
        System.out.println("Reserva cancelada");
    }

    public void modificarReserva() {
        System.out.println("Reserva modificada");
    }

    public Date getFecha() {
        return fecha;
    }
}
