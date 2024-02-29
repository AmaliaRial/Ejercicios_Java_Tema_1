package InputOutput;

import java.util.Scanner;

public class Scanf {
    public static void main(String[] args) {
        Scanner scanf =new Scanner(System.in);

        System.out.println("Introduce un numero entero: ");
        int numero1 = scanf.nextInt();
        System.out.println("Has introducido el numero: "+numero1);

        System.out.println("Introduce un numero entero: ");
        int numero2= scanf.nextInt();
        System.out.println("Has introducido el numero: "+numero2);

        System.out.println("Introduce un string: ");
        String nombre = scanf.next();
        System.out.println("Has introducido: "+nombre);
    }
}
