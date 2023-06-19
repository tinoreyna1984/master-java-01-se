import java.util.Scanner;

public class MenorNumeroComparadoCon10 {
    public static void main(String[] args) {
        System.out.println("Menor número comparado con 10");
        Scanner scanner = new Scanner(System.in);
        int i = 0, cantidad = 0, pivote = 0;
        String mensaje = "";
        try {
            while(cantidad < 10) {
                System.out.println("Ingrese cantidad de valores enteros (mínimo 10): ");
                cantidad = scanner.nextInt();
            }
            System.out.println("Recibiremos " + cantidad + " números");
            int[] valores = new int[cantidad];
            do {
                System.out.println("Ingrese valor " + (i+1) + ": ");
                valores[i] = scanner.nextInt();
                i++;
            } while(i < cantidad);

            // ordenamiento del array (burbuja)
            for (int j = 0; j < valores.length; j++) {
                for (int k = 0; k < valores.length - j - 1; k++) {
                    if(valores[k + 1] < valores[k]) {
                        pivote = valores[k];
                        valores[k] = valores[k+1];
                        valores[k+1] = pivote;
                    }
                }
            }

            // tomar el menor valor (el primero del array) y generar el mensaje final
            mensaje = (valores[0] < 10) ? "El número menor es menor que 10" : " El numero menor es igual o mayor que 10";
            System.out.println(mensaje);
        }
        catch (Exception e){
            System.out.println("Error: " + e);
        }

    }
}
