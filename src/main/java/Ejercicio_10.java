
//Escribir un programa que rellene una matriz cuadrada (las dimensiones de la
//matriz serán un parámetro que se pida al usuario) con números aleatorios de
//tal modo que la matriz sea simétrica. Imprimir la matriz por pantalla.
//Realice tod en una única función a la que se llama desde el main.


import java.util.Scanner;
public class Ejercicio_10 {


    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        System.out.print("Ingrese la dimension de la matriz: ");
        int dimension = scanf.nextInt();
        int[][] matriz = matrizSimentrica(dimension);
        imprimirMatriz(matriz);

    }

    /**
     * This function creates a symetrical matrix with random numbers.
     * @param dimension
     * @return matrix
     */
    public static int[][] matrizSimentrica(int dimension){ //los elementos de la matriz son simétricos respecto a la diagonal principal
        int[][] matriz = new int[dimension][dimension];
        for(int i=0; i<dimension; i++){
            for(int j = i; j<dimension; j++){
                int numAleatorio = (int)(Math.random()*100);
                matriz[i][j]= numAleatorio;
                matriz[j][i]= numAleatorio;
            }
        }
        return matriz;
    }

    /**
     *This function prints a matrix
     * @param matriz
     */
    public static void imprimirMatriz(int[][] matriz){
        System.out.println("La matriz generada es:");
        for(int i=0; i< matriz.length; i++){
            for (int j=0; j< matriz[0].length; j++){
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
