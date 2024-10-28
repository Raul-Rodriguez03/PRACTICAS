public class Main {
    public static void main(String[] args) {
        // Crear una instancia de PagoConTarjeta
        PagoConTarjeta pagoConTarjeta = new PagoConTarjeta(
            150.75, 
            "2024-10-28", 
            "1234-5678-9012-3456", 
            "Juan Pérez", 
            "12/25", 
            "123"
        );

        // Usar los métodos de PagoConTarjeta
        System.out.println("Detalles del Pago:");
        System.out.println("Monto: " + pagoConTarjeta.getMonto());
        System.out.println("Fecha: " + pagoConTarjeta.getFecha());
        System.out.println("Número de Tarjeta: " + pagoConTarjeta.getNumeroTarjeta());
        System.out.println("Nombre del Titular: " + pagoConTarjeta.getNombreTitular());
        System.out.println("Fecha de Expiración: " + pagoConTarjeta.getFechaExpiracion());
        System.out.println("CVV: " + pagoConTarjeta.getCvv());

        // Procesar y validar el pago
        pagoConTarjeta.iniciarTransaccion();
        pagoConTarjeta.procesarPago();
        boolean esValido = pagoConTarjeta.validarPago();
        System.out.println("¿El pago es válido? " + esValido);
        pagoConTarjeta.finalizarTransaccion();
    }
}
