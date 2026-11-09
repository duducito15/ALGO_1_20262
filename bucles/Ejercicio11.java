package bucles;

public class Ejercicio11 {
    public static void main(String[] args) {
        int numeroIntroducido;
        boolean esPrimo = true;

        System.out.println("Ingrese un número entero: ");
        numeroIntroducido = Integer.parseInt(System.console().readLine());

        for (int i = 2; i < numeroIntroducido; i++) {
            if ((numeroIntroducido % i )==0) {
                esPrimo = false;
            }
        }

        if (esPrimo) {
            System.out.println("El número introducido es primo");
        } else {
            System.out.println("El número introducido no es primo");
        }
    }
}
