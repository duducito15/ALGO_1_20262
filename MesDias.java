public class MesDias {
    public static void main(String[] args) {
        System.out.println("Ingrese el número de mes: ");
        int mes = Integer.parseInt(System.console().readLine());

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("el mes tiene 31 días");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("el mes tiene 30 días");
                break;
            case 2:
                System.out.println("el mes tiene 28 días en años comunes, 29 en años bisiestos");
                break;
            default:
                break;
        }
    }
}
