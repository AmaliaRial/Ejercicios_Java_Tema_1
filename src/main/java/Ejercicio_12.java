
//Escribe un programa que acepte una cadena de caracteres (que podrá
// contener cualquier carácter a excepción del retorno de carro) y que
//diga cuántas vocales contiene. Realice la entrada de teclado en una
//función (lectura de una string) y el cálculo de vocales de una string en
//otra función independiente que reciba una string y devuelva un entero.

import InputOutput.Input;

public class Ejercicio_12 {

    public static void main(String[] args) {
        //INPUT
        String question= Input.leerString("Introduce una frase: ");
        //PROCESSING
        int vocales= contarVocales(question);
        //OUTPUT
        System.out.println("La frase '"+question+"' contiene: "+vocales+" vocales");

    }

    /**
     * This function collects the number of vowels on a sentence or word
     * @param question
     * @return vowels
     */
    public static int contarVocales(String question){
        question=question.toLowerCase();
        int vocales=0;
        for (int x=0; x<question.length(); x++){
            if ((question.charAt(x)=='a') || (question.charAt(x)=='e') || (question.charAt(x)=='i') || (question.charAt(x)=='o') || (question.charAt(x)=='u')||(question.charAt(x)=='á') || (question.charAt(x)=='é') || (question.charAt(x)=='í') || (question.charAt(x)=='ó') || (question.charAt(x)=='ú')){
                vocales++;
            }
        }
        return vocales;
    }
}
