import com.compania.app.administrativo.Gerente;

public class Main {
    public static void main(String[] args) {
        System.out.println("Presentación de un gerente\n**************************\n");
        String gerNombre, gerApellido, gerNumFiscal, gerDireccion;
        double remuneracion, presupuesto;

        gerNombre = "Tino";
        gerApellido = "Reyna";
        gerNumFiscal = "12345678";
        gerDireccion = "Guayaquil, Ecuador";
        remuneracion = 4500.00;
        presupuesto = 50000.00;

        Gerente gerente = new Gerente(gerNombre, gerApellido, gerNumFiscal, gerDireccion, remuneracion, presupuesto);

        System.out.println("Datos del gerente\n-----------------");
        System.out.println(gerente.toString());
    }
}
