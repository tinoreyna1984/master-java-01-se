
public class Main {
    public static void main(String[] args) {
        //
        String texto = "Si es pecador, no lo sé, pero esto sé: antes fui ciego y ahora puedo ver.";
        StringLimpio sl = s -> {
            char[] arrayCaracteres = s.toCharArray();
            String nuevoString = "";
            for (char caracter: arrayCaracteres) {
                boolean condicion = (caracter != ' ' && caracter != '.' && caracter != ',' && caracter != ':');
                if(condicion) nuevoString += caracter;
            }
            return nuevoString.toUpperCase();
        };
        Limpiador limpiador = new Limpiador();
        System.out.println("Texto Original: " + texto);
        System.out.println("Texto Modificado: " + limpiador.limpiadorCaracteres(texto, sl)); // SIESPECADORNOLOSÉPEROESTOSÉANTESFUICIEGOYAHORAPUEDOVER
    }
}