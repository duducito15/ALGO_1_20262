package arrays;

public class ArrayBi01 {
    public static void main(String[] args) {
        int[][] num = new int[3][2];

        num[0][0] = 20;
        num[1][0] = 67;
        num[1][1] = 33;
        num[2][1] = 7;

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
