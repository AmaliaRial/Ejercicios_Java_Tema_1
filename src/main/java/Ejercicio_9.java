//Escribir un programa que solicite al usuario dos vectores de N
//elementos y que imprima su producto escalar. Utilice un array para
//representar el vector de N elementos. Realice la entrada de usuario por
//teclado en una función que reciba las dimensiones del vector a la que se
//invoca dos veces (una por vector) y otra función que calcule el producto
//escalar recibiendo dos arrays que representan dos vectores.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Ejercicio_9 {

    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Ingrese la dimensión de los vectores: ");
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String st1 = br.readLine();
            int dimension = Integer.parseInt(st1);

            System.out.println("Dame los datos datos del vector 1" );
            int[] vector1 = leerVector(scanf, dimension);

            int[] vector2= leerVector(scanf, dimension);

            int productoEscalar = productoEscalar(vector1, vector2);

            System.out.println("El producto escalar de los dos vectores es: "+productoEscalar);

        }
        catch(IOException ioe)
        {
            System.out.println(ioe);
        }
}

    /**
     * This function reads the elements of the vector
     * @param scanf
     * @param n
     * @return
     */
    public static int[] leerVector(Scanner scanf, int n){
        int[] vector = new int[n];
        for (int i=0; i<n; i++){
            System.out.print("Ingrese el elemento " + (i+1)+": ");
            vector[i]= scanf.nextInt();
        }
        return vector;
    }

    /**
     * This function calculates the scalar product of two vectors
     * @param vector1
     * @param vector2
     * @return scalar product
     */
    public static int productoEscalar( int[] vector1, int[] vector2){
        int productoEscalar=0;
        for (int i=0; i< vector1.length; i++){
            productoEscalar += vector1[i]*vector2[i];
        }
        return  productoEscalar;
    }
}
