public class Main {
    public static void main(String[] args) {
        // Crear objetos de Rueda y Cuadro
        Rueda ruedaDelantera = new Rueda(26, "Montaña", "Aluminio");
        Rueda ruedaTrasera = new Rueda(26, "Montaña", "Aluminio");
        Cuadro cuadro = new Cuadro("Carbono", "Negro", 17.5);

        // Crear objeto de Bicicleta
        Bicicleta bicicleta = new Bicicleta(ruedaDelantera, ruedaTrasera, cuadro);

        // Mostrar información de la bicicleta
        bicicleta.mostrarInfo();
    }
}
