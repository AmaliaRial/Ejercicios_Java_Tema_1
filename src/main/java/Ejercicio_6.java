import InputOutput.Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio_6 {
    //Escribe un programa que muestre por pantalla la lista de los N primeros números primos. Realiza una función que reciba N, devuelve un array conteniendo los N primeros números primos y posteriormente imprima el array en el main.

    /**
     * This function calculates the first N prime numbers
     * @param n --> the number of primes that the user wants to find.
     * @return an array of the prime numbers
     * @throws IOException
     */
    public static int[] primos(int n) throws IOException{
        int numeros_primos_encontrados=0;
        int divisor=0;
        int numero=1;
        int divisores_encontrados=0;
        int array[]= new int[n];

        while(numeros_primos_encontrados<n){
            for(divisor=2; divisor<numero; divisor++){
                if(numero%divisor == 0){
                    divisores_encontrados++;
                }
            }

            if(divisores_encontrados==0){
                System.out.println(numero+" es primo.");
                numeros_primos_encontrados++;
            }
        numero++;
        divisores_encontrados=0;
        }
    array[0]=numero;
    return array;
    }


    /**
     * This function reads a Line and then turns it into a number
     * @param s
     * @return
     * @throws IOException
     */
    public static int scanf(String s)throws IOException {
        System.out.println(s);
        BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));
        String stringLeido= consola.readLine();
        int a = Integer.parseInt(stringLeido);

        return a;
    }

    public static void main(String[] args)throws IOException {
        System.out.print("Indique la cantidad de numeros primos que quiere recibir:");
        int n= Input.leerInt();
        int[] numeros= primos(n);

    }

}
