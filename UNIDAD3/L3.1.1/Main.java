public class Main {
    public static void main(String[] args){
        Ave ave = new Ave("Águila", 3, 6.5, "Plumas doradas", true);
        System.out.println("\nDetalles del Ave:");
        System.out.println("Nombre: " + ave.getNombre()); 
        System.out.println("Edad: " + ave.getEdad()); System.out.println("Peso: " + ave.getPeso());
        System.out.println("Tipo de Plumas: " + ave.getTipoDePlumas()); 
        System.out.println("Puede Volar: " + ave.isPuedeVolar());
        
    }
    

}
