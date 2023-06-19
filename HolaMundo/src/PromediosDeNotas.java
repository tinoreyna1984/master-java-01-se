import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class PromediosDeNotas {

    public double formatoDecimal(double valor){
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.DOWN);
        double valorTruncado = Double.parseDouble(df.format(valor));
        return valorTruncado;
    }

    public static void main(String[] args) {
        PromediosDeNotas pdn = new PromediosDeNotas();
        Scanner scanner = new Scanner(System.in);
        int contNotasMayoresA5 = 0, contNotasInferioresA4 = 0, notasUno = 0, notasIngresadas = 0;
        double nota = 0.00, notaMayorA5 = 0.00, notaInferiorA4 = 0.00, notasTotal = 0.00;

        try {
            System.out.println("Notas del aula");
            for (int i = 0; i < 20; i++) {
                System.out.println("Ingresar nota " + (i+1) + ": ");
                nota = scanner.nextDouble();
                if(nota > 5 && nota <= 7){
                    notaMayorA5 += nota;
                    contNotasMayoresA5++;
                }
                else if(nota > 1 && nota < 4) {
                    notaInferiorA4 += nota;
                    contNotasInferioresA4++;
                }
                else if(nota == 1){
                    notasUno++;
                }
                else if( nota < 1 || nota > 7 ) {
                    throw new Exception("Error: nota no válida. Debe ingresarse valor de nota en el rango de 1 a 7");
                }
                notasTotal += nota;
                notasIngresadas++;
            }
            System.out.println("Promedio de notas mayores a 5: " + pdn.formatoDecimal(notaMayorA5/contNotasMayoresA5));
            System.out.println("Promedio de notas inferiores a 4: " + pdn.formatoDecimal(notaInferiorA4/contNotasInferioresA4));
            System.out.println("Total de notas 1: " + notasUno);
            System.out.println("Promedio total de todas las notas ingresadas: " + pdn.formatoDecimal(notasTotal/notasIngresadas));
        }
        catch (Exception e){
            System.out.println("Error: " + e);
        }
    }
}
