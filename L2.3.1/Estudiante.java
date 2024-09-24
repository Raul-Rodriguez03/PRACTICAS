
public class Estudiante extends Persona {
    private String matricula;
    private double promedio;

    // Constructor
    public Estudiante(String nombre, int edad, String genero, String direccion, String telefono, String matricula, double promedio) {
        super(nombre, edad, genero, direccion, telefono);
        this.matricula = matricula;
        this.promedio = promedio;
    }

    // Getters y Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    // Métodos adicionales
    public void estudiar(String materia) {
        System.out.println(getNombre() + " está estudiando " + materia);
    }

    public void asistirClase(String clase) {
        System.out.println(getNombre() + " está asistiendo a la clase de " + clase);
    }
}
