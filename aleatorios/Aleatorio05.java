package aleatorios;

public class Aleatorio05 {
    public static void main(String[] args) {
        System.out.println("Diez números aleatorios, entre 50 y 60 (sin decimales): ");

        for (int i = 1; i < 11; i++) {
            System.out.println((int) (Math.random() * 11 + 50));
        }
    }
}
