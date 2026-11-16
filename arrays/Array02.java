package arrays;

public class Array02 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        numeros[0] = 15;
        numeros[1] = 45;
        numeros[2] = 48;
        numeros[3] = 60;
        numeros[4] = 20;

        System.out.println("El array tiene 5 elementos ¿Cual de ellos quieres ver?");
        System.out.print("Ingrese un número del 0 al 4: ");

        int indice = Integer.parseInt(System.console().readLine());
        System.out.println(" es el " + numeros[indice]);
    }
}
