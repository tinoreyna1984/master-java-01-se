import com.generics.producto.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BolsaSupermercado<T> implements Iterable<T> {

    private List<T> productos;
    private int max;

    public BolsaSupermercado(int max) {
        this.max = max; // para limitar el ArrayList
        this.productos = new ArrayList<>();
    }

    public void addProducto(T producto){ // no usar clase producto sino el genérico T
        if(this.productos.size() <= max){
            this.productos.add(producto);
        }
        else {
            throw new RuntimeException("Se llegó al límite de productos");
        }
    }

    public static <T> void getProductos(BolsaSupermercado<T> bolsa){
        for (T prod: bolsa) {
            System.out.println(((Producto) prod).getNombre() + ": " + ((Producto) prod).getPrecio() + "USD");
            if (prod instanceof Fruta){
                System.out.println(((Fruta) prod).getNombre() + " " + ((Fruta) prod).getColor() + ", " + ((Fruta) prod).getPeso());
            } else if (prod instanceof Lacteo) {
                System.out.println("Cantidad: " + ((Lacteo) prod).getCantidad() + ", proteinas: " + ((Lacteo) prod).getProteinas());
            } else if (prod instanceof Limpieza) {
                System.out.println("Componentes: " + ((Limpieza) prod).getComponentes() + ", contenido: " + ((Limpieza) prod).getLitros());
            } else if (prod instanceof NoPerecible) {
                System.out.println("Cantidad: " + ((NoPerecible) prod).getContenido() + ", calorías: " + ((NoPerecible) prod).getCalorias());
            }
        }
    }

    @Override
    public Iterator<T> iterator() {
        return this.productos.iterator();
    }
}
