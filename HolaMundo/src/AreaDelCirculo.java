import java.awt.geom.Area;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaDelCirculo {
    public double formatoDecimal(double valor){
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.DOWN);
        double valorTruncado = Double.parseDouble(df.format(valor));
        return valorTruncado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radio = 0.00, area = 0.00;
        AreaDelCirculo adc = new AreaDelCirculo();

        System.out.println("Area del círculo");
        System.out.println("Ingrese un valor de radio (en metros):");

        try {
            radio = scanner.nextDouble();
            area = Math.PI * Math.pow(radio, 2);
            System.out.println("El área del círculo calculado es: " + adc.formatoDecimal(area) + "m2");
        }
        catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
            main(args);
            System.exit(0);
        }
    }
}
