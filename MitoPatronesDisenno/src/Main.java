import com.patrones.singleton.Pais;
import com.patrones.singleton.PaisDAOImpl;

public class Main {
    public static void main(String[] args) {
        PaisDAOImpl dao = PaisDAOImpl.getInstance();
        PaisDAOImpl dao1 = PaisDAOImpl.getInstance(); // dao1 = dao
        // primer recorrido
        for (Object p: dao.getPaises()) {
            System.out.println("País : " + ((Pais)p).getNombre());
        }
        // segundo recorrido
        // dao1 = dao
        for (Object p1: dao1.getPaises()) {
            System.out.println("País : " + ((Pais)p1).getNombre());
        }
    }
}