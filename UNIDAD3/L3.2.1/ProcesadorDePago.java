
public interface ProcesadorDePago { 
    void iniciarTransaccion(); 
    void finalizarTransaccion();
    void cancelarTransaccion(); 
}