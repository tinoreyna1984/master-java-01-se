public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        
        String archivo = "alguna.imagen.pdf";
        int i = archivo.lastIndexOf(".");
        System.out.println("archivo.length() = " + archivo.length()); // 17 caracteres
        System.out.println("archivo.substring(archivo.length()-4) = " + archivo.substring(i+1)); // quito 14 caracteres: pdf
    }
}
