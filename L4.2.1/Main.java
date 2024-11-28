import java.util.Date;
// Clase principal para probar el polimorfismo
public class Main {
    public static void main(String[] args) {
        Reserva reserva1 = new ReservaHabitacion("R1", new Date(), 101);
        Reserva reserva2 = new ReservaEvento("R2", new Date(), 202);

        reserva1.crearReserva();
        reserva2.crearReserva();

        reserva1.cancelarReserva();
        reserva2.modificarReserva();

        System.out.println("Fecha de la reserva 1: " + reserva1.getFecha());
        System.out.println("Fecha de la reserva 2: " + reserva2.getFecha());
    }
} 
