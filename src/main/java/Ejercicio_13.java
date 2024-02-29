import InputOutput.Input;

public class Ejercicio_13 {
//Escribe un programa que acepte una cadena de caracteres (que podrá contener
//cualquier carácter a excepción del retorno de carro) y que la escriba al revés.
//Reutiliza la función del ejercicio para la entrada de teclado y otra función
//que invierta la cadena.

    public static void main(String[] args) {
        //INPUT
        String cadena = Input.leerString("Introduce una cadena de caracteres: ");//el nextLine deja que lea una frase y no solo un simple string

        //PROCESSING
        String cadenaInvertida = invertirCadena(cadena);

        //OUTPUT
        System.out.println("La cadena invertida es: " + cadenaInvertida);
    }

    /**
     * Esta funcion invierte una frase introducida por el usuario
     * @param cadena
     * @return cadenaInvertida
     */
    public static String invertirCadena(String cadena) {

        String cadenaInvertida = "";

        for(int i = cadena.length() - 1; i >= 0; --i) {
            cadenaInvertida = cadenaInvertida + cadena.charAt(i); //va leyendo los caracteres de derecha a izquierda y los aplica a la nueva string
        }

        return cadenaInvertida;
    }

}
