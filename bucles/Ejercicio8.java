package bucles;

public class Ejercicio8 {
    public static void main(String[] args) {
        int numeroDigitos, n, numeroIntroducido;
        numeroDigitos=1;
        
        System.out.println("Ingrese un número entero: ");
        numeroIntroducido = Integer.parseInt(System.console().readLine());

        n = numeroIntroducido;

        while (n > 10) {
            n = n/10;// n/=10
            numeroDigitos++;
        }

        System.out.println(numeroIntroducido+ " tiene "+numeroDigitos+" digito/s.");
    }
}
