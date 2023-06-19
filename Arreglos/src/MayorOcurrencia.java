import java.util.Scanner;

public class MayorOcurrencia {

    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] ocurrencias = new int[10];
        int contOc = 0, indice = 0, max = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("Obtener el valor de mayor ocurrencia en un arreglo de 10 elementos");

        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Ingresar valor " + (i+1) + " (valores del 1 al 9): ");
                arr[i] = s.nextInt();
                if (arr[i] < 1 || arr[i] > 9)
                    throw new Exception("Valor no permitido");
            }
            for (int i = 0; i < arr.length; i++) {
                contOc = 0;
                for (int j = 0; j < arr.length; j++) {
                    if(arr[j] == arr[i])
                        contOc++;
                }
                ocurrencias[i] = contOc;
            }
            // se busca el valor mayor de ocurrencia y su posición
            for (int i = 0; i < arr.length; i++) {
                if (max < ocurrencias[i]) {
                    max = ocurrencias[i];
                    indice = i;
                }
            }
            System.out.println("Elemento de mayor ocurrencia: " + arr[indice]);
            System.out.println("Frecuencia de " + arr[indice] + ": " + ocurrencias[indice]);
        }
        catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        finally {
            System.out.println("Fin del programa.");
        }
    }
}
