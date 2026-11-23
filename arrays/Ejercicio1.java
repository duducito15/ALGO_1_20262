package arrays;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[][] num = new int[3][6];

        num[0][0] = 0;
        num[0][1] = 30;
        num[0][2] = 2;
        num[0][5] = 5;
        num[1][0] = 75;
        num[1][4] = 0;
        num[2][2] = -2;
        num[2][3] = 9;
        num[2][5] = 11;
        int filas, columnas;

        columnas = 0;

        for (filas = 0; filas < 3; filas++) {
            System.out.print("Fila " + filas + ": ");
            for (columnas = 0; columnas < 6; columnas++) {
                System.out.print(num[filas][columnas]+ " ");
            }
            int suma = 0;
            System.out.println();
        }
    }
}
