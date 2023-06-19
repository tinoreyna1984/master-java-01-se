import java.util.Scanner;

public class EjemploOrdenes {
    public static void main(String[] args) {
        System.out.println("Ordenes de compra - pedir 3");
        Scanner scanner = new Scanner(System.in);
        OrdenCompra[] ordenesCompra = new OrdenCompra[3];
        String nombre = "", apellido = "";

        // por facilidad
        String marcaAcme = "ACME";

        // inicializar un conjunto de productos del mercado (10)
        Producto[] productosDisponibles = new Producto[12];
        productosDisponibles[0] = new Producto(marcaAcme, "Fideos", 5);
        productosDisponibles[1] = new Producto(marcaAcme, "Leche", 12);
        productosDisponibles[2] = new Producto(marcaAcme, "Carnes", 9);
        productosDisponibles[3] = new Producto(marcaAcme, "Jabón", 2);
        productosDisponibles[4] = new Producto(marcaAcme, "Shampoo", 3);
        productosDisponibles[5] = new Producto(marcaAcme, "Pasta dental", 3);
        productosDisponibles[6] = new Producto(marcaAcme, "Aceite", 5);
        productosDisponibles[7] = new Producto(marcaAcme, "Verduras", 5);
        productosDisponibles[8] = new Producto(marcaAcme, "Agua", 10);
        productosDisponibles[9] = new Producto(marcaAcme, "Café", 2);
        productosDisponibles[10] = new Producto(marcaAcme, "Azúcar", 2);
        productosDisponibles[11] = new Producto(marcaAcme, "Pan", 1);

        System.out.print("Nombre del cliente: ");
        nombre = scanner.next();
        System.out.print("Apellido del cliente: ");
        apellido = scanner.next();

        System.out.println("Pedido a nombre de: " + nombre + " " + apellido);

        System.out.println("Estos son los productos disponibles:");
        for (int j = 0; j < 12; j++) {
            System.out.println((j+1) + ") " + productosDisponibles[j].getNombre() + ": " + productosDisponibles[j].getPrecio());
        }

        System.out.println("\n*******************************************\n");
        try {
            for (int i = 0; i < 3; i++) {
                //
                System.out.println("\nOrden número " + (i+1));
                System.out.print("Ingrese la descripción de la orden: ");
                String descripcion = scanner.next();
                OrdenCompra oc = new OrdenCompra(descripcion);
                oc.setCliente(new Cliente(nombre, apellido));
                ordenesCompra[i] = oc;
                //
                for (int j = 0; j < 4; j++) {
                    System.out.print("Ingrese producto: (valor del 1 al 12, sin repetir) : ");
                    int idxProd = scanner.nextInt() - 1;
                    if(idxProd < 0 || idxProd > 11)
                        throw new Exception("Error: valor no permitido.");
                    oc.addProducto(productosDisponibles[idxProd]);
                }
                System.out.println();
            }
            System.out.println("\n*******************************************\n");
            System.out.println("Ordenes generadas:");
            for (int i = 0; i < 3; i++) {
                System.out.println("ID orden: " + ordenesCompra[i].getId());
                System.out.println("Detalle:");
                ordenesCompra[i].detalleProductos();
                System.out.println("Total a pagar: " + ordenesCompra[i].granTotal());
            }
        }
        catch (Exception e){
            System.err.println("Error: " + e.getMessage());
        }

    }
}
