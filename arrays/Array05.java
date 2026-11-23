package arrays;

public class Array05 {
    public static void main(String[] args) {
        double[] notas = new double[3];

        System.out.println("Ingrese las tres notas a promediar:");

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese la nota "+(i+1)+": ");
            notas[i] = Double.parseDouble(System.console().readLine());
        }

        double suma= 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i]+ " ");
            suma +=notas[i];
        }

        System.out.println("\nEl promedio es: "+ (suma/3));
    }
}
