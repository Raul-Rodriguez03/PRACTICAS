
public abstract class Pago { 

    protected double monto; 
    protected String fecha; 

    public Pago(double monto, String fecha) { 
    this.monto = monto; 
    this.fecha = fecha; 
    } 
    public double getMonto() 
    { return monto; 
    } 
    public void setMonto(double monto) { 
        this.monto = monto; 
    } 
    public String getFecha() { 
        return fecha; 
    } 
    public void setFecha(String fecha) { 
        this.fecha = fecha; 
    }
    // Métodos abstractos 
    public abstract void procesarPago(); 
    public abstract boolean validarPago();
}
