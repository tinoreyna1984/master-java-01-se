import javax.swing.*;

public class DetalleDeFactura {
    public static void main(String[] args) {
        String productos = JOptionPane.showInputDialog(null, "Ingrese los productos comprados: ");
        String numProductos = JOptionPane.showInputDialog(null, "Ingrese el total de unidades adquiridas: ");
        int cantidad = Integer.parseInt(numProductos);
        double[] precios = new double[cantidad];
        double total = 0;
        for(int i = 0; i < cantidad; i++){
            String precioIngresado = JOptionPane.showInputDialog(null, "Ingrese los precios (en USD): ");
            precios[i] = Double.parseDouble(precioIngresado);
            total += precios[i];
        }
        double precioTotalConImpuesto = 1.19*total;
        JOptionPane.showMessageDialog(null, "La factura para " + productos + " tiene un total bruto de USD" + total + ", con un impuesto de USD" + 0.19*total + " y el monto después de impuesto es de USD" + precioTotalConImpuesto);
    }
}
