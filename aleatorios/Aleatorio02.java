package aleatorios;

public class Aleatorio02 {
    public static void main(String[] args) {
        System.out.println("Diez números aleatorios, entre 0 y 10: ");

        for (int i = 1; i < 11; i++) {
            System.out.println(Math.random()*10);
        }
    }
}
