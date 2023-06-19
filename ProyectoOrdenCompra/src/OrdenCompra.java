import java.util.Date;

public class OrdenCompra {

    private Integer id;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;
    private int indiceProductos;
    private static int ultimoId;

    public OrdenCompra(String descripcion) {
        this.id = ++ultimoId;
        this.descripcion = descripcion;
        this.productos = new Producto[4];
        this.indiceProductos = 0;
    }

    public Integer getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addProducto(Producto producto){
        if(indiceProductos < 4) {
            this.productos[indiceProductos++] = producto;
        }
    }

    public void detalleProductos(){
        for (int i = 0; i < this.productos.length; i++) {
            System.out.println((i+1) + ": " + this.productos[i].getNombre() + ", marca: " + this.productos[i].getFabricante() + ", precio: USD" + this.productos[i].getPrecio());
        }
    }

    public int granTotal (){
        int total = 0;
        for (int i = 0; i < this.productos.length; i++) {
            total += this.productos[i].getPrecio();
        }
        return total;
    }
}
