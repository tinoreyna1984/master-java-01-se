import java.util.Arrays;
import java.util.Scanner;

public class NumeroMasAltoDelArreglo {
    public static void main(String[] args) {
        int[] a = new int[7];
        int max = 0, num = 0, k = 0, pivote = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("El valor más alto de un arreglo de 7 elementos");

        try {
            do {
                System.out.print("\rIngrese valor " + (k+1) + " (del 11 al 99): ");
                num = s.nextInt();
                if(num < 11 || num > 99)
                    throw new Exception("Valor no permitido.");
                a[k] = num;
                k++;
            } while (k < a.length);

            for(int i = 1; i < a.length; i++){
                max = (a[max] > a[i])? max: i;
            }
            System.out.println("El valor más alto: " + a[max]);
        }
        catch (Exception e){
            System.err.println("Error: " + e.getMessage());
        }
        finally {
            System.out.println("Fin del programa.");
        }
    }
}
