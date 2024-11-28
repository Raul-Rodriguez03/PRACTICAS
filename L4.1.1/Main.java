// Clase principal para probar el polimorfismo
public class Main{
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Autobus("A1", 50, "Ruta 5");
        Vehiculo vehiculo2 = new Tren("T1", 200, "Línea 1");
        Vehiculo vehiculo3 = new Tranvia("TR1", 100, "Vía 3");

        vehiculo1.start();
        vehiculo2.start();
        vehiculo3.start();

        System.out.println("Capacidad del autobús: " + vehiculo1.getCapacity());
        System.out.println("Capacidad del tren: " + vehiculo2.getCapacity());
        System.out.println("Capacidad del tranvía: " + vehiculo3.getCapacity());
    }
}
