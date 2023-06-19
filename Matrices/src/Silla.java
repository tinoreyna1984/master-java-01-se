import java.util.Scanner;

public class Silla {
    public static void main(String[] args) {
        System.out.println("Imprimir una silla");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresar dimensión de silla: ");
        int dimension = scanner.nextInt();
        if(dimension < 3) {
            System.err.println("No válido. Mínimo 3 dimensiones para que tenga sentido");
            System.exit(-1);
        }
        char[][] silla = new char[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                silla[i][j] = ' ';
            }
        }
        for (int i = 0; i < dimension; i++) {
            silla[i][0] = '*'; // respaldo y patas traseras
            if(i == dimension/2) { // asiento
                for (int j = 0; j < dimension; j++) {
                    silla[i][j] = '*';
                }
            }
            else if(i > dimension/2) { // patas delanteras
                silla[i][dimension - 1] = '*';
            }
        }
        // imprime silla
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print(silla[i][j]);
            }
            System.out.println();
        }
    }
}
