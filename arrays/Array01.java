package arrays;

public class Array01 {
    public static void main(String[] args) {
        //Declarara un array
        int[] numeros;
        numeros = new int[5];
        
        numeros[0] = 15;
        numeros[1] = 45;
        numeros[2] = 48;
        numeros[3] = 60;
        numeros[4] = 20;

        System.out.println("Segundo valor del array numeros "+numeros[1]);
        System.out.println("Cuarto valor del array numeros "+numeros[3]);
        int suma = numeros[0]+numeros[1]+numeros[2]+numeros[3]+numeros[4];
        System.out.println("La suma de los valores del array es: " +suma);
    }
}
