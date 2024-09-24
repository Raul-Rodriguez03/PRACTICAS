import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Persona[] integrantes = new Persona[3];
        
        for(int i = 0; i<integrantes.length; i++){
            integrantes[i] = new Persona();

            System.out.println("Integrante #"+ (i+1));

            System.out.print("Nombre: ");
            integrantes[i].setNombre(input.next());

            System.out.print("edad: ");
            integrantes[i].setEdad(input.nextInt());

            System.out.print("altura: ");
            integrantes[i].setAltura(input.nextFloat());

            System.out.print("Numero Telefonico: ");
            integrantes[i].setNumeroTel(input.nextInt());
            
            System.out.print("Correo Electronico: ");
            integrantes[i].setCorreoElectronico(input.next());
            
            integrantes[i].comer("Enchiladas");
            integrantes[i].dormir(1);
            integrantes[i].hacerEjercicio("Lagartijas");

        }
        System.out.println("\n");
        for(int i = 0; i < integrantes.length; i++){
            System.out.println("Persona #" + (i+1));
            System.out.println("Nombre : " + integrantes[i].getNombre());
            System.out.println("Edad : " + integrantes[i].getEdad());
            System.out.println("Altura : " + integrantes[i].getAltura());
            System.out.println("Numero Tel : " + integrantes[i].getNumeroTel());
            System.out.println("Correo Electronico : " + integrantes[i].getCorreoElectronico());

        }
        

    }
}
