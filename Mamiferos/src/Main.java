import com.zoo.mamiferos.base.Mamifero;
import com.zoo.mamiferos.species.*;

public class Main {
    public static void main(String[] args) {
        Mamifero[] mamiferos = new Mamifero[6];

        mamiferos[0] = new Leon("Panthera leo", 1.5f, 1.8f, 190.0f, "sabanas africanas", 2.2f, 80, 8, 10.0f);
        mamiferos[1] = new Perro("Canis dingo", 1.2f, 1.2f, 60.0f, "Australia", 10);
        mamiferos[2] = new Perro("Canis familiaris", 1.1f, 1.0f, 65.0f, "hogares", 5);
        mamiferos[3] = new Tigre("Panthera tigris tigris", 1.1f, 3.1f, 260.0f, "India, Nepal, Birmania, Bután, Bangladesh, Tibet", 4.5f, 50, "Tigre de Bengala");
        mamiferos[4] = new Lobo("Canis lupus", 0.85f, 1.6f, 80.0f, "Terrenos nevados de EEUU", "gris", 0.45f, 7, "Lobo");
        mamiferos[5] = new Guepardo("Acinonyx jubatus", 0.94f, 1.5f, 72.0f, "sabanas africanas", 1.5f, 115);

        for (Mamifero mamifero: mamiferos) {
            System.out.println("Nombre científico: " + mamifero.getNombreCientifico());
            System.out.println("Dimensiones: altura: " + mamifero.getAltura() + ", largo: " + mamifero.getLargo() + ", peso: " + mamifero.getPeso());
            System.out.println("Hábitat " + mamifero.getHabitat());
            System.out.println("\nCaracterísticas:");
            System.out.println("- " + mamifero.comer());
            System.out.println("- " + mamifero.dormir());
            System.out.println("- " + mamifero.correr());
            System.out.println("- " + mamifero.comunicarse());
            System.out.println();
        }
    }
}
