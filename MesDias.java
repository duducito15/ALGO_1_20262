public class MesDias {
    public static void main(String[] args) {
        System.out.println("Ingrese el nombre del mes: ");
        String nombreMes = System.console().readLine();

        switch (nombreMes.toLowerCase()) {
            case "enero", "marzo", "mayo", "julio", "agosto", "octubre", "diciembre" ->
                System.out.println("el mes " + nombreMes + " tiene 31 días");
            case "abril", "junio", "setiembre", "noviembre" ->
                System.out.println("el mes " + nombreMes + " tiene 30 días");
            case "febrero" ->
                System.out.println("el mes " + nombreMes + " tiene 28 días en años comunes, 29 en años bisiestos");
            default -> System.out.println("No tiene días el numero de mes que ingresaste");
        }
    }
}
