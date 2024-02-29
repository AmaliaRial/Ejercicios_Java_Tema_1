
/* Escribe un programa que lee una cadena de caracteres de teclado e
indique si es o no palíndroma (se lee igual de izquierda a derecha
que de derecha a izquierda, sin tener en cuenta los espacios en blanco
y las mayúsculas). Por ejemplo: "dábale arroz a la zorra el abad".
Reutilice la función del ejercicio 12 para la entrada de teclado y cree
otra función que dada una cadena de caracteres devuelva un boolean
indicando si es o no palíndroma. */

import InputOutput.Input;

public class Ejercicio_14 {

    public static void main(String[] args) {

        String sentence = Input.leerString("Introduce una frase: ");
        System.out.println("¿Es la frase '" + sentence + "' un palíndromo? " + esPalindromo(sentence));
    }

    /**
     * Esta funcion devuelve un bool y averigua si una frase es o no palíndromo
     * @param cadena
     * @return true or false
     */
    public static boolean esPalindromo(String cadena) {
        cadena = cadena.toLowerCase();
        for (int i = 0, j = cadena.length() - 1; i <= j; i++, j--) {
            if (cadena.charAt(i) != cadena.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
