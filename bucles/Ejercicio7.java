package bucles;

public class Ejercicio7 {
    public static void main(String[] args) {
        int intentos = 4;
        int numeroIntroducido;
        boolean acertado = false;
        do {
            System.out.println("Introduce la clave de la caja fuerte: ");
            numeroIntroducido = Integer.parseInt(System.console().readLine());
            if (numeroIntroducido == 4567) {
                acertado = true;
            } else {
                System.out.println("Clave incorrecta");
            }
            intentos--;
        } while ((intentos > 0) && (!acertado));

        if (acertado==true) {
            System.out.println("Ha abierto la caja fuerte");
        } else {
            System.out.println("Lo siento, has agatado tus 4 oportunidades.");
        }
    }
}
