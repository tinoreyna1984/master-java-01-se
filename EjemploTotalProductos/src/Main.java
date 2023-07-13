import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //
        List<Producto> productos = Arrays.asList(
                new Producto(2.25, 10),
                new Producto(1.5, 3),
                new Producto(4.4, 5),
                new Producto(0.15, 1)
        );
        double total = productos.stream()
                .mapToDouble(Producto::importePorProducto) // esa función creada sirve para sintetizar en el map
                .sum(); // obtiene la suma
        System.out.println("Total de los productos: " + total);
    }
}