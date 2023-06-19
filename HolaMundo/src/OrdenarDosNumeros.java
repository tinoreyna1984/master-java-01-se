import java.util.Scanner;

public class OrdenarDosNumeros {
    public static void main(String[] args) {
        int[] numeros = new int[2];
        System.out.println("Ordenar dos números");
        Scanner scanner = new Scanner(System.in);
        try {
            for (int i = 0; i < 2; i++) {
                System.out.println("Ingresa número entero: ");
                Integer numero = Integer.parseInt(scanner.nextLine());
                numeros[i] = numero;
            }
            int tmpNum = numeros[0]; // ordena de mayor a menor
            if(numeros[0] < numeros[1]) {
                numeros[0] = numeros[1];
                numeros[1] = tmpNum;
            }
            System.out.println("Primer número: " + numeros[0]);
            System.out.println("Segundo número: " + numeros[1]);
        }
        catch (NumberFormatException nfe){
            System.out.println("Error: " + nfe.toString());
        }
    }
}
