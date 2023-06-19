public class EjemploMatricesStringFor {
    public static void main(String[] args) {

        String[][] nombres = new String[3][2];
        nombres[0][0] = "Pepe";
        nombres[0][1] = "Pepa";
        nombres[1][0] = "Josefa";
        nombres[1][1] = "Paco";
        nombres[2][0] = "Lucas";
        nombres[2][1] = "Pancha";

        System.out.println("Iterando con for: ");
        for(int i = 0; i < nombres.length; i++){

            for(int j = 0; j < nombres[i].length; j++){
                System.out.print(nombres[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Iterando con foreach: ");

        for(String[] fila: nombres){ // fila como arreglo de objetos de la clase String
            for(String nombre: fila){ // cada nombre es un objeto de la clase String en la fila actual
                System.out.print(nombre + "\t");
            }
            System.out.println();
        }

    }
}
