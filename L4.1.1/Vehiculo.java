abstract class Vehiculo{
    private String id; 
    private int capacity;

    public Vehiculo(String id, int capacity) { 
    this.id = id; 
    this.capacity = capacity; 
    }

    public abstract void start();

    public void stop() { 
    System.out.println("Vehículo detenido"); 
    } 
    
    public int getCapacity() { 
    return capacity; 
    }
}
