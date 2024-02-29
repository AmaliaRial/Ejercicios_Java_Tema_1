import InputOutput.Input;
import java.io.IOException;

public class Ejercicio_4 {
//Escribe un programa que calcule el mínimo y el máximo de una lista de números enteros positivos introducidos por el usuario. La lista finalizará cuando se introduzca un número negativo.

    public static void main(String[] args) throws IOException {
        int[] a= lista();
        System.out.println("El minimo es "+min(a)+" y el maximo es "+max(a));
    }

    /**
     * This function reads a list of numbers introduced by the User until a negative one is introduced
     * @return
     * @throws IOException
     */
    public static int[] lista() throws IOException{
        int i=0;
        int j;
        int[] array1 =new int[100]; //siempre que queramos crear un array se pone asi
        do {
            System.out.print("Introduzca numeros (un numero negativo para terminar): ");
            array1[i]= Input.leerInt();
            System.out.println(array1[i]);
            i++;
        }while(array1[i-1]>=0);

        int[] array2 =new int [i-1];
        for(j=0; j<(i-1); j++){
            array2[j]= array1[j];
        }
        return array2;
    }

    /**
     * This function calculates the smallest number in an array
     * @param a
     * @return min
     */
    public static int min( int[] a){
        int min =a[0];
        int i;
        int j;
        for (i=0; i<a.length; i++){
            if(a[i]<min) min= a[i];
        }
        return min;
    }


    /**
     * This function calculates the highest number in an array
     * @param a
     * @return max
     */
    public static int max( int[] a){
        int max =a[0];
        int i;
        int j;
        for (i=0; i<a.length; i++){
            if(a[i]>max) max= a[i];
        }
        return max;
    }
}
