import com.mito.concurrencia.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // instancia de THilo (Thread)
        THilo hilo1 = new THilo(1);
        hilo1.start();

        // método estático sleep: pausa por un lapso definido en milisegundos
        THilo.sleep(3000); // 3 segundos

        // una instancia de Thread emplea una instancia anónima de RHilo
        Thread hilo2 = new Thread(new RHilo(2));
        hilo2.start();
        hilo2.join();

        // una instancia de Thread emplea una instancia de Runnable
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("[A]Hilo ejecuntandose");
            }
        };
        Thread hilo3 = new Thread(r);
        //hilo3.start();
        if(!hilo3.isAlive()){ // solo se ejecuta hilo3 si no está activo
            System.out.println("Iniciando hilo 3");
            hilo3.start();
        }

        System.out.println("Ejecutándose hilo MAIN");
    }
}