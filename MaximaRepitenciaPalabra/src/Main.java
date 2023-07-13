import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //
        String texto = "Solo sé que nada sé";

        ContadorPalabras contador = frase -> {

            // Limpiamos la frase eliminando los puntos, comas y dejamos todo en minúsculas
            // luego con split convertimos la frase en un arreglo para iterarlo.
            String[] arreglo = frase.replace(".", "")
                    .replace(",", "")
                    .toLowerCase()
                    .split(" ");

            // con un for doble iteramos cada palabra y la comparamos con cada una del arreglo.
            // así podemos calcular el máximo que se repite una palabra
            // definimos dos variables importantes la palabra mas repetida y el max o cantidad de veces que se repite la palabra
            int max = 0;
            String palabra = null;
            for (int i = 0; i < arreglo.length; i++) {
                int cantidad = 0;
                for (int j = 0; j < arreglo.length; j++) {
                    if (arreglo[i].equalsIgnoreCase(arreglo[j])) {
                        cantidad++;
                    }
                }

                if(cantidad > max){
                    max = cantidad;
                    palabra = arreglo[i];
                }
            }
            // finalmente devolvemos el resultado de la palabra mas repetida y el  numero de veces que se repite en un Map
            // donde la llave es la palabra y max la cantidad.
            return Collections.singletonMap(palabra, max);
        };

        contador.contarPalabras(texto).forEach((k, v) -> System.out.println("La palabra " + k + " se repite " + v + " veces."));
    }
}