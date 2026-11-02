import java.util.Scanner;

public class LeerDatosScanner2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce 3 numeros separados por un espacio (pueden ser con decimales)");

        double n1 = s.nextDouble();
        double n2 = s.nextDouble();
        double n3 = s.nextDouble();
        
        double promedio = (n1+n2+n3) / 3;

        System.out.println("El promedio es: " + promedio);


    }
}
