import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SistemaReservas {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("C1", "Juan Pérez", "juan@example.com", "123456789");
        Habitacion habitacion = new Habitacion("H1", 101, "Doble", 150.0);
        Reserva reserva = new Reserva("R1", new Date(), new Date(), cliente, habitacion);

        ReservaDAO reservaDAO = new ReservaDAO();
        List<Reserva> reservas = reservaDAO.cargarReservas();
        reservas.add(reserva);
        reservaDAO.guardarReservas(reservas);

        for (Reserva r : reservas) {
            System.out.println("Reserva ID: " + r.getId() + ", Cliente: " + r.getCliente().getNombre() + ", Habitación: " + r.getHabitacion().getNumero());
        }
    }
}
