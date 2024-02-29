import InputOutput.Input;

import java.util.Scanner;

public class Ejercicio_7 {
    //Escribe un programa que lea un número entero de teclado, lo guarde en una variable, lo envíe a una función que lo descomponga en factores primos, y dicha función devuelva un array que contenga los factores primos. Posteriormente imprima el array en el main.
    //por ejemplo 40 = 2 * 2* 2 * 5.


    /**
     * This function decomposes a number introduced by the used in prime numbers
     * @param numero
     * @return prime factors
     */
    public static int[] factores(int numero){
        //inicializamos un array para almacenar los factores primos
        int factoresprimos[]=new int[6];
        int indice=0;
        for(int factor=2; factor<=numero; factor++){
            if(numero%factor==0){
                    factoresprimos[indice]=factor;
                    numero=numero/factor;
                    indice++;
                    factor--;
                }
            }
    //devolver el array con los factores primos
    return factoresprimos;
    }


    public static void main(String[] args)  {
        System.out.print("Ingresa un numero entero: ");
        int numero = Input.leerInt();

        //llamamos a la funcion para obtener los factores primos
        int [] factoresPrimos = factores(numero);

        //imprimimos los factores primos obtenidos
        System.out.print(numero+ " = ");
        for (int i=0; i < factoresPrimos.length; i++){
            System.out.print(factoresPrimos[i]+"*");

        }
    }
}
