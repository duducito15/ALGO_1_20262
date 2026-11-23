package arrays;

public class ArrayForEach {
    public static void main(String[] args) {
        double[] notas = new double[4];
        System.out.println("Para calcular la nota media necesito saber la ");
        System.out.println("nota de cada uno de tus exámenes.");

        for (int i = 0; i < 4; i++) {
            System.out.print("Nota del examen no " + (i + 1) + ": ");
            notas[i] = Double.parseDouble(System.console().readLine());
        }

        System.out.println("Tus notas son: ");

        double suma = 0;

        for (double n : notas) {
            System.out.print(n + " ");
            suma = suma + n;
        }
        System.out.println("La media es: " + (suma / 4));
    }
}
