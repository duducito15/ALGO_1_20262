package arrays;

public class Array06 {
    public static void main(String[] args) {
        String[] color = {"rojo", "verde","amarillo", "blanco", "azul","negro"};

        System.out.println("Ingrese las franjas que quiere para su bandera: ");
        int franjas = Integer.parseInt(System.console().readLine());

        System.out.println("----------");
        for (int i = 0; i < franjas; i++) {
            System.out.println(color[(int)(Math.random()*6)]);
        }
    }
}
