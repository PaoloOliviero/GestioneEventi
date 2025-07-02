package PaoloOliviero;

import PaoloOliviero.entities.TipoEvento;
import PaoloOliviero.entities.Evento;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {
    private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory ("gestioneeventipu");
    Evento matrimonio = new Evento (1L, "SPOSI",new java.util.GregorianCalendar(2012, java.util.Calendar.SEPTEMBER, 12).getTime(),
            "questo è un matrimonio", TipoEvento.NUZIALE, 20);

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
