public class MesDias {
    public static void main(String[] args) {
        System.out.println("Ingrese el número de mes: ");
        int mes = Integer.parseInt(System.console().readLine());

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("el mes tiene 31 días");
            case 4, 6 ,9,11 -> System.out.println("el mes tiene 30 días");
            case 2-> System.out.println("el mes tiene 28 días en años comunes, 29 en años bisiestos");
            default-> System.out.println("No tiene días el numero de mes que ingresaste");
        }
    }
}
