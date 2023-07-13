import com.ejercicio.abstracta.Producto;
import com.ejercicio.interfaces.IProducto;
import com.ejercicio.productos.Comic;
import com.ejercicio.productos.IPhone;
import com.ejercicio.productos.Libro;
import com.ejercicio.productos.TvLcd;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // productos
        IProducto[] productos = new Producto[4];
        productos[0] = new Comic(25, Date.from(LocalDate.of(1959, 10, 29).atStartOfDay(ZoneId.systemDefault()).toInstant()), "Albert Uderzo, René Goscinny", "Astérix", "Dargaud", "Astérix");
        productos[1] = new IPhone(700, "Apple", "13 Pro Max", "Negro");
        productos[2] = new TvLcd(1250, "Sony", 60);
        productos[3] = new Libro(35, Date.from(LocalDate.ofYearDay(1866, 1).atStartOfDay(ZoneId.systemDefault()).toInstant()), "Fiódor Dostoyevski", "Crimen y Castigo", "Editores Mexicanos Unidos");

        for (IProducto prod: productos) {
            if(prod instanceof IPhone){
                System.out.println("Descripción: iPhone " + ((IPhone) prod).getModelo() + " color " + ((IPhone) prod).getColor() + " de " + ((IPhone) prod).getFabricante());
            } else if (prod instanceof TvLcd) {
                System.out.println("Descripción: TV LCD " + ((TvLcd) prod).getFabricante() + " de " + ((TvLcd) prod).getPulgadas() + " pulgadas");
            } else if (prod instanceof Libro) {
                System.out.println("Descripción: libro " + ((Libro) prod).getTitulo() + " (" + ((Libro) prod).getAutor() + ")  - " + ((Libro) prod).getFechaPublicacion().toString() + ". Editorial: " + ((Libro) prod).getEditorial());
            } else if (prod instanceof Comic) {
                System.out.println("Descripción: comic " + ((Comic) prod).getTitulo() + " (" + ((Comic) prod).getAutor() + ")  - " + ((Comic) prod).getFechaPublicacion().toString() + ". Editorial: " + ((Comic) prod).getEditorial());
            }
            System.out.println("Precio original: " + prod.getPrecio());
            System.out.println("Precio de venta: " + prod.getPrecioVenta());
        }
    }
}