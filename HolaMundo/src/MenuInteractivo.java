import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class MenuInteractivo {
    public static void main(String[] args) {
        int opcionIndice = 0;

        JOptionPane.showMessageDialog(null, "Bienvenido", "Mantenedor de Productos", JOptionPane.INFORMATION_MESSAGE);

        // trabajo con clave-valor para las opciones
        Map<String, Integer> opciones = new HashMap();
        opciones.put("Actualizar", 1);
        opciones.put("Eliminar", 2);
        opciones.put("Agregar", 3);
        opciones.put("Listar", 4);
        opciones.put("Salir", 5);

        Object[] opArreglo = opciones.keySet().toArray();

        do{
            Object opcion = JOptionPane.showInputDialog(null,
                    "Seleccione un Opción",
                    "Mantenedor de Productos",
                    JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);
            if (opcion == null) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una operación", "No válido", JOptionPane.ERROR_MESSAGE);
            } else {
                opcionIndice = opciones.get(opcion.toString());
            }
            switch (opcionIndice){
                case 1:
                    JOptionPane.showMessageDialog(null, "Usuario actualizado correctamente", "Correcto", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente", "Correcto", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Usuario agregado correctamente", "Correcto", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Se listan los usuarios correctamente", "Correcto", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 5:
                    System.out.println("Sale correctamente del sistema");
                    System.exit(0);
            }
        } while(opcionIndice != 5);
    }
}
