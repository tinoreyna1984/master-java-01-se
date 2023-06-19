import java.util.Scanner;

public class ProgramaManejoDeNombres {

    public String transformaNombre(String nombre){
        String parteUno = String.valueOf(nombre.charAt(1)).toUpperCase();
        String parteDos = nombre.substring(nombre.length() - 2);
        String transformado = parteUno.concat(".").concat(parteDos);
        return transformado;
    }

    public static void main(String[] args) {
        System.out.println("Tres nombres de familiares y/o amigos...");
        String cadenaFinal = "";
        ProgramaManejoDeNombres pdn = new ProgramaManejoDeNombres();
        Scanner scanner = new Scanner(System.in);
        try {
            for(int i = 0; i < 3; i++){
                System.out.println("Ingresa nombre: ");
                String nombre = scanner.nextLine();
                cadenaFinal += pdn.transformaNombre(nombre) + ((i < 2) ? "_" : "");
            }
            System.out.println("Resultado: " + cadenaFinal);
        }
        catch (Exception e){
            System.out.println("Error general: " + e.getMessage());
        }
    }
}
