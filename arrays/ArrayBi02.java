package arrays;

public class ArrayBi02 {
    public static void main(String[] args) {
        int[][] num = { { 20, 0 }, { 67, 33 }, { 0, 7 } };

        int fila, columna;

        for (fila = 0; fila < 3; fila++) {
            System.out.print("Fila " + fila + ": ");
            for (columna = 0; columna < 2; columna++) {
                System.out.print(num[fila][columna] + " ");
            }
            System.out.println();
        }
    }
}
