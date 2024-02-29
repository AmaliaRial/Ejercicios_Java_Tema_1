public class Ejercicio_3 {
//Calcular la suma de todos los múltiplos de 5 comprendidos entre 1 y 100.
//Calcular además cuantos hay (ver operaciones sobre arrays) y visualizar
//cada uno de ellos. Utilizar una función que reciba el número de múltiplos de
//5 y devuelva un array contenido todos los múltiplos de 5 desde el valor
//del parámetro begin hasta el valor del parámetro end. Realizar otra
//función que dado un array como parámetro, lo recorra de inicio a fin y
//devuelva la suma de todos sus valores.
    public static void main(String[] args) {
        int i=1;
        int[] multiplos_cinco = new int[100];
        int suma_multiplos;
        multiplos_cinco= multiplos(i);

        suma_multiplos=sumatorio(multiplos_cinco);

            System.out.println("La suma de los multiplos de 5 es: "+suma_multiplos);
            System.out.println("El numero de multiplos de 5 es : "+multiplos_cinco);

    }

    /**
     * This function calculates the multiples of 5 in between 1-100
     * @param i
     * @return multiples
     */
    public static int[] multiplos(int i){
        int[] multiplo= new int[100];
        for (i=0; i< multiplo.length; i++){
            if(i%5==0){
                multiplo[i]= i;
            }
        }
        return multiplo;
    }

    /**
     * This function adds all the multiples of 5 in between 1-100
     * @param multiplo
     * @return sum
     */
    public static int sumatorio(int[] multiplo){
        int sum=0;
        int i;
        for(i=0; multiplo.length<100; i++){
            sum=sum+i;
        }
        return sum;
    }
}
