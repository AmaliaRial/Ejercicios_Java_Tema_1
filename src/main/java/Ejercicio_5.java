import java.io.IOException;

public class Ejercicio_5 {
    /**
     * This calculates the multiplication tables of the first 10 natural numbers.
     * @param args
     * @throws IOException
     */
    public static void main(String[] args)throws IOException {
        int n;
        for (n = 1; n <= 10; n++) {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(n + "x" + i + "=" + n * i);
                }
            System.out.println("--------------------------------");
            }
        }
    }
