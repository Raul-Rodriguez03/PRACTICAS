public class Persona{

    private String nombre;
    private int edad;
    private float altura;
    private int numeroTel;
    private String correoElectronico;


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
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public int getNumeroTel() {
        return numeroTel;
    }
    public void setNumeroTel(int numeroTel) {
        this.numeroTel = numeroTel;
    }
    public String getCorreoElectronico() {
        return correoElectronico;
    }
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void comer(String comida){
        System.out.println(nombre + " esta comiendo: " + comida);
    }

    public void dormir(int horas){
        System.out.println(nombre + " dormira por: " + horas + " horas");

    }
    public void hacerEjercicio(String ejercicio){
        System.out.println(nombre + " esta realizando: " + ejercicio);
    }

    

}