import java.util.Scanner;

public class MedidaTanqueGasolina {
    public static void main(String[] args) {
        System.out.println("Medida de tanque de gasolina");
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Ingresa la medida del tanque: ");
            Double medida = Double.parseDouble(scanner.nextLine());
            String mensaje = (medida >=1 && medida < 20) ? "Insuficiente"
                    : (medida >=20 && medida < 35) ? "Suficiente"
                    : (medida >=35 && medida < 40) ? "Medio estanque"
                    : (medida >=40 && medida < 60) ? "Estanque 3/4"
                    : (medida >=60 && medida < 70) ? "Estanque casi lleno"
                    : "Lleno";
            System.out.println("Estado del tanque: " + mensaje);
        }
        catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
    }
}
