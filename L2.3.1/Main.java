public class Main {
    public static void main(String[] args) {
        // Crear un objeto de Estudiante
        Estudiante estudiante = new Estudiante("Juan Pérez", 20, "Masculino", "Calle Falsa 123", "555-1234", "A001", 8.5);
        
        // Usar métodos de Persona
        estudiante.comer("pizza");
        estudiante.dormir(8);
        estudiante.tomarShower("15 minutos");

        // Usar métodos de Estudiante
        estudiante.estudiar("Matemáticas");
        estudiante.asistirClase("Programación");

        // Acceder a atributos protegidos
        System.out.println("Género: " + estudiante.getGenero());
        System.out.println("Teléfono: " + estudiante.getTelefono());

        // No se puede acceder a métodos privados desde fuera de la clase
        // estudiante.metodoPrivado(); // Esto causará un error de compilación
    }
}
