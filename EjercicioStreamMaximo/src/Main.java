import java.util.Arrays;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        //
        Integer[] numeros = {10, 25, 45, 32, 2, 18};
        Function<Integer[], Integer> max = arr -> Arrays.stream(arr).reduce(0, (a, b) -> (a > b) ? a : b);
        Integer resultado = max.apply(numeros);
        System.out.println("resultado: " + resultado);
    }
}