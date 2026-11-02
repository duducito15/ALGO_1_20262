public class SentenciaSwitch {
    public static void main(String[] args) {
        // switch
        System.out.println("Ingresa el numero de día de la semana: ");

        int dia = Integer.parseInt(System.console().readLine());

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miercoles");
                break;
            case 5:
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("No tengo nombre para ese número de día");
                break;
        }

    }
}
