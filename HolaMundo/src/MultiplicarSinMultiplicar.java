import java.util.Scanner;

public class MultiplicarSinMultiplicar {
    public int multiplicar(int a, int b){
        if (a == 0 || b == 0) {
            return 0;
        }
        var resultado = 0;
        for (int i = 0; i < a; i++) {
            resultado += b;
        }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println("Multiplicar sin multiplicar (dos números)");
        MultiplicarSinMultiplicar msm = new MultiplicarSinMultiplicar();
        Scanner scanner = new Scanner(System.in);
        int num01 = 0, num02 = 0;

        try {
            System.out.println("Ingrese primer valor: ");
            num01 = scanner.nextInt();
            System.out.println("Ingrese segundo valor: ");
            num02 = scanner.nextInt();
            System.out.println("El producto de los valores ingresados es: " + msm.multiplicar(num01, num02));
        }
        catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
