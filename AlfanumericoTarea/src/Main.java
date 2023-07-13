import com.ejercicio.enums.Tipo;
import com.ejercicio.hilos.AlfanumericoTarea;

public class Main {
    public static void main(String[] args) {
        Thread numeros01, letras01,  numeros02, letras02;
        numeros01 = new Thread(new AlfanumericoTarea(Tipo.NUMERO));
        letras01 = new Thread(new AlfanumericoTarea(Tipo.LETRA));
        numeros02 = new Thread(new AlfanumericoTarea(Tipo.NUMERO));
        letras02 = new Thread(new AlfanumericoTarea(Tipo.LETRA));

        // ejecuta hilos
        System.out.println("Primer par...");
        numeros01.start();
        letras01.start();
        System.out.println("Segundo par...");
        numeros02.start();
        letras02.start();
        System.out.println("Fin.");
    }
}