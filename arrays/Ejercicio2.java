package arrays;

public class Ejercicio2 {

    public static void main(String[] args) {

        int[][] num = new int[4][5];

        int[] sumaColumnas = new int[5];
        int sumaTotal = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                num[i][j] = (int)(Math.random() * 101);
            }
        }

        System.out.println("MATRIZ Y SUMAS PARCIALES\n");

        for (int i = 0; i < 4; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 5; j++) {
                System.out.printf("%5d", num[i][j]);
                sumaFila += num[i][j];
                sumaColumnas[j] += num[i][j];
            }
            sumaTotal += sumaFila;
            System.out.printf(" | %5d\n", sumaFila);
        }

        System.out.println("--------------------------------");
        for (int j = 0; j < 5; j++) {
            System.out.printf("%5d", sumaColumnas[j]);
        }

        System.out.printf(" | %5d\n", sumaTotal);
    }
}
