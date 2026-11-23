package arrays;

public class Array04 {
    public static void main(String[] args) {
        int[] num = new int[10];

        for (int i = 0; i < num.length; i++) {
            //System.out.print("Ingrese el valor de num[" + i + "]: ");
            num[i] = (int) (Math.random()*101);
        }

        System.out.println("El array num tiene los siguientes elementos: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(num[i]);
        }

    }
}
