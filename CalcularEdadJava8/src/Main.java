
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Ingresa tu fecha de naciomiento (dd/MM/yyyy): ");
            String fechaIngresada = scanner.next();
            LocalDate fechaNacimiento = LocalDate.parse(fechaIngresada, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            LocalDate hoy = LocalDate.now();
            Period edad = Period.between(fechaNacimiento, hoy);
            System.out.println("Tu edad es " + edad.getYears() + " años.");
        }
        catch (Exception e){
            System.err.println("Error: " + e.getMessage());
        }

    }
}