
// Clase que hereda de Pago e implementa ProcesadorDePago
public class PagoConTarjeta extends Pago implements ProcesadorDePago {
    private String numeroTarjeta;
    private String nombreTitular;
    private String fechaExpiracion;
    private String cvv;

    public PagoConTarjeta(double monto, String fecha, String numeroTarjeta, String nombreTitular, String fechaExpiracion, String cvv) {
        super(monto, fecha);
        this.numeroTarjeta = numeroTarjeta;
        this.nombreTitular = nombreTitular;
        this.fechaExpiracion = fechaExpiracion;
        this.cvv = cvv;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    @Override
    public void procesarPago() {
        // Implementación del procesamiento del pago con tarjeta
        System.out.println("Procesando pago con tarjeta...");
    }

    @Override
    public boolean validarPago() {
        // Implementación de la validación del pago con tarjeta
        System.out.println("Validando pago con tarjeta...");
        return true;
    }

    @Override
    public void iniciarTransaccion() {
        // Implementación de iniciar transacción
        System.out.println("Iniciando transacción...");
    }

    @Override
    public void finalizarTransaccion() {
        // Implementación de finalizar transacción
        System.out.println("Finalizando transacción...");
    }

    @Override
    public void cancelarTransaccion() {
        // Implementación de cancelar transacción
        System.out.println("Cancelando transacción...");
    }
}
