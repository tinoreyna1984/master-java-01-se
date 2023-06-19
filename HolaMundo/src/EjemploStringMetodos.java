public class EjemploStringMetodos {
    public static void main(String[] args) {
        
        String nombre = "Andres";

        System.out.println("nombre.length() = " + nombre.length()); // longitud del String (es tratado como un array)
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase()); // transforma a mayúsculas
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase()); // transforma a minúsculas
        System.out.println("nombre.equals(\"Andres\") = " + nombre.equals("Andres")); // la cadena es igual al parámetro "Andres", true
        System.out.println("nombre.equals(\"andres\") = " + nombre.equals("andres")); // false
        System.out.println("nombre.equalsIgnoreCase(\"andres\") = " + nombre.equalsIgnoreCase("andres")); // compara sin tener en cuenta mayúsculas o minúsculas
        System.out.println("nombre.compareTo(\"Andres\") = " + nombre.compareTo("Andres")); // compara lexicográficamente el valor del String con la cadena que viene como parámetro. Devuelve un entero. En este caso, devuelve cero.
        System.out.println("nombre.compareTo(\"Aaron\") = " + nombre.compareTo("Aaron")); // devuelve 13
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0)); // posición del caracter en 0. Devuelve A
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1)); // posición del caracter en 1. Devuelve n
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1)); // devuelve s

        System.out.println("nombre.substring(1) = " + nombre.substring(1)); // subcadena. Devuelve "ndres"
        System.out.println("nombre.substring(1, 4) = " + nombre.substring(1, 4)); // subcadena. Devuelve "ndr"
        System.out.println("nombre.substring(nombre.length()-2) = " + nombre.substring(nombre.length()-2)); // devuelve "es"

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas = " + trabalenguas.replace("a", ".")); // reemplaza "a" por ".". Devuelve "tr.b.lengu.s"
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a')); // devuelve la posición (desde cero) del primer caracter indicado, en este caso 2
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a')); // devuelve la posición (desde cero) del último caracter indicado, en este caso 10
        System.out.println("trabalenguas.indexOf('t') = " + trabalenguas.indexOf("lenguas")); // devuelve la posición de la primera ocurrencia del caracter presentado, en este caso 0
        System.out.println("trabalenguas.contains('t') = " + trabalenguas.contains("lenguas")); // consulta si la cadena incluye el caracter señalado, devuelve true
        System.out.println("trabalenguas.startsWith(\"tr\") = " + trabalenguas.startsWith("tr")); // consulta si la cadena comienza con el caracter indicado en el parámetro, devuelve true
        System.out.println("trabalenguas.endsWith(\"s\") = " + trabalenguas.endsWith("s")); // consulta si la cadena termina con el caracter indicado en el parámetro, devuelve true
        System.out.println("  trabalenguas ");
        System.out.println("  trabalenguas ".trim()); // corta espacios en blanco, devuelve "trabalenguas" (sin espacios)
        
    }
}
