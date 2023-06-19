import java.util.Scanner;

public class EstadisticasArreglo {
    public static void main(String[] args) {
        int contCeros = 0, contPosit = 0, contNeg = 0;
        double sumPosit = 0.00, sumNeg = 0.00;
        int arr[] = new int[7];
        Scanner s = new Scanner(System.in);

        System.out.println("Estadísticas para un arreglo de 7 elementos");

        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Ingrese valor " + (i+1) + ": ");
                arr[i] = s.nextInt();
                if(arr[i] < 0) {
                    sumNeg += arr[i];
                    contNeg++;
                }
                else if (arr[i] > 0) {
                    sumPosit += arr[i];
                    contPosit++;
                }
                else {
                    contCeros++;
                }
            }
            System.out.println("Estadísticas:");
            System.out.println("Promedio de valores positivos: " + (float) sumPosit/contPosit);
            System.out.println("Promedio de valores negativos: " + (float) sumNeg/contNeg);
            System.out.println("Total de ceros: " + contCeros);

        }
        catch (Exception e){
            System.err.println("Error: " + e.getMessage());
        }
        finally {
            System.out.println("Fin del programa.");
        }
    }
}
