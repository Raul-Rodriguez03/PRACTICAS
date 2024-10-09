public class Main {
    public static void main(String[] args) {
        //se crea la instancia de Bicicleta
        Bicicleta bicicleta = new Bicicleta(null, null, null);

        // se usa esa instancia para crear las ruedas y el cuadro
        Bicicleta.Rueda ruedaDelantera = bicicleta.new Rueda(28, "Montaña", "Aluminio");
        Bicicleta.Rueda ruedaTrasera = bicicleta.new Rueda(28, "Montaña", "Aluminio");
        Bicicleta.Cuadro cuadro = bicicleta.new Cuadro("Carbono", "Rojo", 54.5);

        // se asocia las ruedas y el cuadro a la bicicleta
        bicicleta.setRuedaDelantera(ruedaDelantera);
        bicicleta.setRuedaTrasera(ruedaTrasera);
        bicicleta.setCuadro(cuadro);

        // Finalmente muestra la información
        bicicleta.mostrarInfo();
    }
}
