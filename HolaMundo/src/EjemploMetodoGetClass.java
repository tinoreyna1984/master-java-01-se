import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {
        
        String texto = "Hola que tal!";

        // permite explorar las propiedades del objeto
        Class strClass = texto.getClass();

        // obtiene los valores de la clase a la que pertenece el objeto
        System.out.println("strClass.getName() = " + strClass.getName()); // strClass.getName() = java.lang.String
        System.out.println("strClass.getSimpleName() = " + strClass.getSimpleName()); // strClass.getSimpleName() = String
        System.out.println("strClass.getPackageName() = " + strClass.getPackageName()); // strClass.getPackageName() = java.lang
        System.out.println("strClass = " + strClass); // strClass = class java.lang.String
        
        for(Method metodo: strClass.getMethods()){ // todos los métodos (se repiten algunos por ser sobrecargados)
            System.out.println("metodo.getName() = " + metodo.getName());
        }

        // aplica para otros wrappers también
        Integer num = 34;
        // también se puede obtener info de las clases padres de la clase a la que el objeto pertenece
        Class intClass = num.getClass(); // intClass.getSuperclass().getSuperclass() = class java.lang.Number
        Class objClass = intClass.getSuperclass().getSuperclass(); // intClass.getSuperclass().getSuperclass() = class java.lang.Object
        System.out.println("intClass.getSuperclass().getSuperclass() = " + intClass.getSuperclass());
        System.out.println("intClass.getSuperclass().getSuperclass() = " + objClass);

        for(Method metodo: objClass.getMethods()){
            System.out.println("metodo.getName() = " + metodo.getName());
        }

    }
}
