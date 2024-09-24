public class Persona {
    private String nombre;
    private int edad;
    protected String genero;
    private String direccion;
    protected String telefono;

    // Constructor
    public Persona(String nombre, int edad, String genero, String direccion, String telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Métodos adicionales
    public void comer(String comida) {
        System.out.println(nombre + " está comiendo " + comida);
    }

    public void dormir(int horas) {
        System.out.println(nombre + " está durmiendo por " + horas + " horas");
    }

    protected void tomarShower(String duracion) {
        System.out.println(nombre + " está tomando una ducha de " + duracion);
    }

    private void metodoPrivado() {
        System.out.println("Este es un método privado");
    }
}
