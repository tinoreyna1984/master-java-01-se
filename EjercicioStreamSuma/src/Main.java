import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //
        Integer[] arreglo = new Integer[100];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = i+1;
        }
        List<Integer> numeros = Arrays.asList(arreglo);
        double numeroGenerado = numeros.stream()
                .filter(n -> (n % 10 != 0))
                .mapToDouble(n -> (double) n/2)
                .reduce(0.0, (a, b) -> a + b);
        System.out.println("numeroGenerado: " + numeroGenerado);
    }
}