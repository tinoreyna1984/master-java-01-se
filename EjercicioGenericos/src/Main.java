import com.generics.producto.*;

public class Main {

    public static void main(String[] args) {
        //
        BolsaSupermercado<Producto> bolsa = new BolsaSupermercado<>(5);

        bolsa.addProducto(new Fruta("Manzana", 2.50, 1.00, "Verde"));
        bolsa.addProducto(new Lacteo("Queso", 1.50, 1, 18));
        bolsa.addProducto(new Limpieza("Lejía", 4.50, "Hipoclorito de sodio", 1.00));
        bolsa.addProducto(new NoPerecible("Frejoles con tocino", 1.25, 1, 18));
        bolsa.addProducto(new NoPerecible("Arroz", 6.00, 1, 50));

        BolsaSupermercado.getProductos(bolsa);
    }
}