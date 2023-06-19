import java.util.Scanner;

public class ImprimirX {
    public static void main(String[] args) {
        System.out.println("Imprimir una X");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresar dimensión de matriz: ");
        int dimension = scanner.nextInt();
        if(dimension == 0) {
            System.err.println("No válido");
            System.exit(-1);
        }
        char[][] matrizX = new char[dimension][dimension];

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if(i == j || j == dimension - i - 1){
                    matrizX[i][j] = '*';
                }
                else matrizX[i][j] = ' ';
            }
        }
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print(matrizX[i][j]);
            }
            System.out.println();
        }
    }
}
