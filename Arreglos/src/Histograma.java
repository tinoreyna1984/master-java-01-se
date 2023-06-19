import java.util.Scanner;

public class Histograma {

    public static void main(String[] args) {
        int[] arr = new int[12];
        int[] frecuencias = new int[6];
        int contFrec = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("Histograma para medir la frecuencia de valores entre 1 y 6");

        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Ingresar valor " + (i+1) + " (valores del 1 al 6): ");
                arr[i] = s.nextInt();
                if (arr[i] < 1 || arr[i] > 6)
                    throw new Exception("Valor no permitido");
            }

            // frecuencias para los valores del 1 al 6
            for (int i = 0; i < 6; i++) {
                contFrec = 0;
                for (int j = 0; j < arr.length; j++) {
                    if(arr[j] == i+1)
                        contFrec++;
                }
                frecuencias[i] = contFrec;
            }

            // resultado
            System.out.println("------------------------------------");
            System.out.println("Histograma: \n\n");
            for (int i = 0; i < 6; i++) {
                System.out.print((i+1) + ": ");
                if(frecuencias[i] >= 1) {
                    for (int j = 0; j < frecuencias[i]; j++) {
                        System.out.print('*');
                    }
                }
                else
                    System.out.print(' ');
                System.out.print("\n");
            }
            System.out.println("------------------------------------");

        }
        catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        finally {
            System.out.println("Fin del programa.");
        }
    }
}
