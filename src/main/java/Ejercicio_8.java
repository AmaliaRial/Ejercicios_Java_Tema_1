//Empleando un array, escribir un programa que pida al usuario
//números enteros hasta que se introduzca el número 0. A continuación,
//calcular la media, el mínimo y el máximo de los datos introducidos. Utilice
//funciones independientes para: a) recibir N números enteros por teclado
//hasta que el usuario introduzca un 0; b) Calcule la media de los elementos de
//un array; c) calcule el mínimo de los elementos de un array; y d) Calcule el
//máximo de los elementos de un array.

import java.util.Scanner;

public class Ejercicio_8{

    public static void main(String[] args) {
        // Pedir números enteros al usuario
        int[] numeros = pedirNumeros();

        // Calcular media
        double media = calcularMedia(numeros);
        System.out.println("La media de los números introducidos es: " + media);

        // Calcular mínimo
        int minimo = calcularMinimo(numeros);
        System.out.println("El mínimo de los números introducidos es: " + minimo);

        // Calcular máximo
        int maximo = calcularMaximo(numeros);
        System.out.println("El máximo de los números introducidos es: " + maximo);
    }


    /**
     * This function ask the user for a list of numbers (type 0 to finish).
     * @return array of numbers
     */
    public static int[] pedirNumeros() {
        Scanner scanf = new Scanner(System.in);
        int[] numeros = new int[0];
        int num;
        do {
            System.out.print("Introduce un número entero (0 para terminar): ");
            num = scanf.nextInt();
            if (num != 0) {
                // Añadir número al array
                int[] numerosArray = new int[numeros.length + 1];
                for (int i = 0; i < numeros.length; i++) {
                    numerosArray[i] = numeros[i]; //el numero introducido se añadira al nuevo array
                }
                numerosArray[numeros.length] = num; //el numero introducido se guarda en la nueva posicion de numeros.length + 1
                numeros = numerosArray;//los numeros del array se guardan en el principal y se devuelven
            }
        } while (num != 0);
    return numeros;
    }


    /**
     * This function calculates the average of a list of numbers introduced by the user.
     * @param numeros
     * @return average
     */
    public static double calcularMedia(int[] numeros) {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i]; //recorro todas las posiciones del array y sumo los numeros
        }
        double media = (double) suma / numeros.length; //la suma entre la cantidad de numeros que hay
        return media;
    }

    /**
     * This function calculates the minimum number of a list of numbers introduced by the user
     * @param numeros
     * @return minimum
     */
    public static int calcularMinimo(int[] numeros) {
        int minimo = numeros[0];
        for (int i = 1; i < numeros.length; i++) { //recorro todas las posiciones del array e identifico cual es la menor
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }
        return minimo;
    }

    /**
     * This function calculates the highest number of a list of numbers introduced by the user.
     * @param numeros
     * @return max
     */
    public static int calcularMaximo(int[] numeros) {
        int maximo = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }
        return maximo;
    }
}


