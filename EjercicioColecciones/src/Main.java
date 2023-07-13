import com.sistema.vuelos.Vuelo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException {
        //
        List<Vuelo> vuelos = new LinkedList<>();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy - HH:mm");

        vuelos.add(new Vuelo("AAL 933","New York","Santiago",df.parse("29/08/2021 - 05:39"),62));
        vuelos.add(new Vuelo("LAT 755","Sao Paulo","Santiago",df.parse("31/08/2021 - 04:45"),47));
        vuelos.add(new Vuelo("SKU 621","Rio De Janeiro","Santiago",df.parse("30/08/2021 - 16:00"),52));
        vuelos.add(new Vuelo("DAL 147","Atlanta","Santiago",df.parse("29/08/2021 - 13:22"),59));
        vuelos.add(new Vuelo("AVA 241","Bogota","Santiago",df.parse("31/08/2021 - 14:05"),25));
        vuelos.add(new Vuelo("AMX 10","Mexico City","Santiago",df.parse("31/08/2021 - 05:20"),29));
        vuelos.add(new Vuelo("IBE 6833","Londres","Santiago",df.parse("30/08/2021 - 08:45"),55));
        vuelos.add(new Vuelo("LAT 2479","Frankfurt","Santiago",df.parse("29/08/2021 - 07:41"),51));
        vuelos.add(new Vuelo("SKU 803","Lima","Santiago",df.parse("30/08/2021 - 10:35"),48));
        vuelos.add(new Vuelo("LAT 533","Los Ángeles","Santiago",df.parse("29/08/2021 - 09:14"),59));
        vuelos.add(new Vuelo("LAT 1447","Guayaquil","Santiago",df.parse("31/08/2021 - 08:33"),31));
        vuelos.add(new Vuelo("CMP 111","Panama City","Santiago",df.parse("31/08/2021 - 15:15"),29));
        vuelos.add(new Vuelo("LAT 705","Madrid","Santiago",df.parse("30/08/2021 - 08:14"),47));
        vuelos.add(new Vuelo("AAL 957","Miami","Santiago",df.parse("29/08/2021 - 22:53"),60));
        vuelos.add(new Vuelo("ARG 5091","Buenos Aires","Santiago",df.parse("31/08/2021 - 09:57"),32));
        vuelos.add(new Vuelo("LAT 1283","Cancún","Santiago",df.parse("31/08/2021 - 04:00"),35));
        vuelos.add(new Vuelo("LAT 579","Barcelona","Santiago",df.parse("29/08/2021 - 07:45"),61));
        vuelos.add(new Vuelo("AAL 945","Dallas-Fort Worth","Santiago",df.parse("30/08/2021 - 07:12"),58));
        vuelos.add(new Vuelo("LAT 501","París","Santiago",df.parse("29/08/2021 - 18:29"),49));
        vuelos.add(new Vuelo("LAT 405","Montevideo","Santiago",df.parse("30/08/2021 - 15:45"),39));

        System.out.println("Lista de vuelos");
        System.out.println("***************\n");
        System.out.println("Vuelo        Origen\tDestino\tFecha llegada\tHora llegada\tNum pasajeros");
        for (Vuelo v: vuelos) {
            System.out.println(v.getVuelo() + "        " + v.getOrigen() + "\t" + v.getDestino() + "\t" + v.getFechaHoraLlegada() + "\t" + v.getPasajeros());
        }
        Collections.sort(vuelos, new Comparator<Vuelo>(){
            @Override
            public int compare(Vuelo v1, Vuelo v2) {
                return v1.getFechaHoraLlegada().compareTo(v2.getFechaHoraLlegada());
            }
        });
        Vuelo ultimoVuelo = ((LinkedList<Vuelo>) vuelos).getLast();
        System.out.println("El último vuelo en llegar es " + ultimoVuelo.getVuelo() + ": " + ultimoVuelo.getOrigen() + ", aterriza el " + ultimoVuelo.getFechaHoraLlegada());
        vuelos.sort(Comparator.comparingInt(Vuelo::getPasajeros));
        Vuelo menorNumPasajeros = ((LinkedList<Vuelo>) vuelos).getFirst();
        System.out.println("El vuelo con menor número de pasajeros es " + menorNumPasajeros.getVuelo() + ": " + menorNumPasajeros.getOrigen() + ", con " + menorNumPasajeros.getPasajeros() + " pasajeros");
    }
}