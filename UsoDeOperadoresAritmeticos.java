public class UsoDeOperadoresAritmeticos {
    public static void main(String[] args) {
        int numero = 100;

        System.out.println(numero + " " + (numero + 5) + " " + (numero - 5));
        System.out.println((numero * 5) + " " + (numero / 5) + " " + (numero % 5));

        int numero2 = 9;

        int suma = numero + numero2;
        System.out.println("La suma es: "+ suma);

        int resta = numero - numero2;
        System.out.println("La resta es: "+ resta);

        int producto = numero * numero2;
        System.out.println("El producto es: "+ producto);

        double division = (double)numero / (double)numero2; //casting o conversion de datos
        System.out.println("El division es: "+ division);

        int resto = numero % numero2;
        System.out.println("El resto es: "+ resto);



    }
}
