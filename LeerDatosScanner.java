import java.util.Scanner;

public class LeerDatosScanner {
    public static void main(String[] args) {
        // Clase Scanner
        Scanner s = new Scanner(System.in);

        System.out.println("Ingresa tu nombre: ");
        String nombre = s.nextLine();

        System.out.println("Ingresa tu edad: ");
        int edad = Integer.parseInt(s.nextLine());

        System.out.println("Tu nombre es: " + nombre + " y tu edad es " + edad);
    }
}
