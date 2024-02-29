import java.util.Scanner;

//Escribir un programa que multiplique dos matrices. Sus dimensiones y
//valores deben de solicitarse al usuario por teclado y tras realizar la
//multiplicación debe visualizarse en pantalla ambas matrices y el resultado
//de la multiplicación. Cree una nueva función similar al ejercicio 9 pero
//que recibirá vectores de varias dimensiones. Realice otra función multiplicar
//matrices que reciba dos arrays de dos dimensiones que representan 2 vectores
//y devuelva otro array de dos dimensiones que contenga su multiplicación.
//En caso de no ser compatibles las dimensiones la función indicará que ha
//habido un error.
public class Ejercicio_11 {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        System.out.print("Introduce el número de filas de la primera matriz: ");
        int filas1 = scanf.nextInt();
        System.out.print("Introduce el número de columnas de la primera matriz: ");
        int columnas1 = scanf.nextInt();
        System.out.print("Introduce el número de filas de la segunda matriz: ");
        int filas2 = scanf.nextInt();
        System.out.print("Introduce el número de columnas de la segunda matriz: ");
        int columnas2 = scanf.nextInt();

        if(columnas1 !=filas2){
            System.out.println("ERROR: las dimensiones de las matrices no son compatibles.");
            return;
        }

        System.out.println("Introduce los valores de la matriz 1: ");
        int[][] matriz1 = crearMatriz(filas1, columnas1);
        System.out.println("Introduce los valores de la matriz 2: ");
        int[][] matriz2 = crearMatriz(filas2, columnas2);

        int[][] matrizResultado = multiplicarMatrices(matriz1, matriz2);

        imprimirMatriz(matriz1);
        System.out.println("*");
        imprimirMatriz(matriz2);
        System.out.println("=");
        imprimirMatriz(matrizResultado);

    }

    /**
     *This function creates a matrix in which it's elements are added manually by the user.
     * @param filas
     * @param columnas
     * @return the matrix created
     */
    public static int[][] crearMatriz(int filas, int columnas){
        Scanner scanf = new Scanner(System.in);
        int[][]matriz = new int[filas][columnas];
        for (int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                matriz[i][j]= scanf.nextInt();
            }
        }
        return matriz;
    }

    /**
     * This function multiplies 2 matrices
     * @param matriz1
     * @param matriz2
     * @return the result, it being a two-dimensional array
     */
    public static int[][] multiplicarMatrices(int[][] matriz1, int[][] matriz2){
        int filas1= matriz1.length;
        int columnas1= matriz1[0].length;
        int filas2= matriz2.length;
        int columnas2= matriz2[0].length;

        if(columnas1 !=filas2){
            System.out.println("ERROR: las dimensiones de las matrices no son compatibles.");
            return null;
        }
        int[][] matrizResultado = new int[filas1][columnas2];

        for(int i=0; i<filas1; i++){
            for(int j=0; j<columnas2; j++){
                int suma= 0;
                for(int k=0; k<columnas1; k++){
                    suma += matriz1[i][k]*matriz2[k][j];
                }
                matrizResultado[i][j]=suma;
            }
        }
        return matrizResultado;
    }

    /**
     * This function prints a matrix
     * @param matriz
     */
    public static void imprimirMatriz(int[][] matriz){
        for(int i=0; i< matriz.length; i++){
            for (int j=0; j< matriz[0].length; j++){
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
