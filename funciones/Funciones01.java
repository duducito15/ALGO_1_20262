package funciones;

public class Funciones01 {

    public static int sumar(int x, int y) {
        return x + y;
    }

    public static int restar(int x, int y) {
        return x - y;
    }

    public static int multiplicar(int x, int y) {
        return x * y;
    }

    public static double dividir(int x, int y) {
        
        if (y == 0) {
            return 0;
        } else {
            return (double) x / (double) y;
        }
    }

    public static void mostrarResultado(double resultado) {
        System.out.println("El resultado es: " + resultado);
    }

    public static void main(String[] args) {
        int a, b;

        a = Integer.parseInt(System.console().readLine());
        b = Integer.parseInt(System.console().readLine());

        mostrarResultado(sumar(a, b));
        mostrarResultado(restar(a, b));
        mostrarResultado(multiplicar(a, b));
        mostrarResultado(dividir(a, b));

    }
}
