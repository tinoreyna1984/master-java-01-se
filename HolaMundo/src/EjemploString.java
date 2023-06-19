public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación Java"; // arreglo de cadena
        String curso2 = new String("Programación Java"); // instancia de string
        
        boolean esIgual = curso == curso2;
        System.out.println("curso == curso2 = " + esIgual); // false
        
        esIgual = curso.equals(curso2); // equals compara valores de cadena, sea de una cadena primitiva o de un objeto tipo String
        System.out.println("curso.equals(curso2) = " + esIgual); // true

        String curso3 = "Programación Java";
        esIgual = curso == curso3; // compara dos cadenas
        System.out.println("curso == curso3 = " + esIgual); // true

        String curso4 = "programación java";
        esIgual = curso.equalsIgnoreCase(curso4); // ignora la distinción entre mayúsculas/minúsculas
        System.out.println("curso == curso4 = " + esIgual); // true

    }
}
