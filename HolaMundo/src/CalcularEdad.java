import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalcularEdad {
    public static void main(String[] args) {
        long edad = 0;
        Scanner s = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Ingrese su fecha de nacimiento con formato 'yyyy-MM-dd': ");

        try {
            Date fechaNacimiento = format.parse(s.next());
            Calendar calActual = Calendar.getInstance();
            Date fechaActual = calActual.getTime();
            edad = fechaActual.getYear() - fechaNacimiento.getYear();
            System.out.println("Edad actual:  " + edad + " años");
        }
        catch (Exception e) {
            System.err.println("La fecha tiene un formato incorrecto: " + e.getMessage());
            System.err.println("El formato debe ser 'yyyy-MM-dd'");
            System.exit(1);
        }
    }
}
