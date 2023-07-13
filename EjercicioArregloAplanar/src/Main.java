import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //
        String[][] lenguajes = {
                {"java", "groovy"},
                {"php"},
                {"c#", "python", "groovy"},
                {"java", "javascript", "kotlin"},
                {"javascript"},
                {}
        };
        Arrays.stream(lenguajes)
                .flatMap(arr -> Arrays.stream(arr)) // streams a partir de sub-arreglos
                .distinct() // elimina duplicados
                .forEach(e -> System.out.println(e)); // imprime en consola
    }
}