public class Ejercicio_1 {
//Escribir un programa que defina variables que representen el número
//de días de un año, el número de horas que tiene un día, el número de
//minutos que tiene una hora y el número de segundos que tiene un minuto.
//Emplear las variables que ocupen el mínimo espacio de memoria posible. A
//continuación, calcular el número de segundos que tiene un año y almacenar
//el valor del cálculo en otra variable. Realizar preferiblemente mediante
//una función que reciba como parámetros el número de años, meses y días y
//devuelva el número de segundos de los días, meses y años introducidos.
    public static void main(String[] args) {

    int seconds=0;
    seconds= data();

    System.out.println("The number of seconds is: "+seconds);
    }

    /**
     * This function indicates de number of seconds there are in a year.
     * @return seconds
     */
    public static int data(){
        short years=18;
        short months = 2;
        short days = 6;
        int seconds= 0;
        seconds= (years*365*24*3600)+(months*30*24*3600) + (days*24*3600);

    return seconds;
    }
}
