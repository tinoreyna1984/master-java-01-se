import javax.swing.*;

public class NombreMasLargo {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Ingresar tres nombres y obtener el más largo");
        try {
            int i = 0;
            String[] nombresSolos = new String[3];
            int pivote = 0;
            String nombreMasLargo = "";

            String nombre01 = "", nombre02 = "", nombre03 = "";
            nombre01 = JOptionPane.showInputDialog(null, "Ingresa nombre + apellido con espacio entre ambos 01: ");
            nombresSolos[0] = nombre01.split(" ")[0];
            nombre02 = JOptionPane.showInputDialog(null, "Ingresa nombre + apellido con espacio entre ambos 02: ");
            nombresSolos[1] = nombre02.split(" ")[0];
            nombre03 = JOptionPane.showInputDialog(null, "Ingresa nombre + apellido con espacio entre ambos 03: ");
            nombresSolos[2] = nombre03.split(" ")[0];

            pivote = nombresSolos[0].length();
            nombreMasLargo =  (nombresSolos[1].length() > pivote) ? nombre02
                            : (nombresSolos[2].length() > pivote) ? nombre03
                            : nombre01;
            JOptionPane.showMessageDialog(null, nombreMasLargo + " tiene el nombre más largo");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }
}
