package PaoloOliviero;

import PaoloOliviero.entities.TipoEvento;
import PaoloOliviero.entities.Evento;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory ("gestioneeventipu");
    public static void main(String[] args) {
            EntityManager em = emf.createEntityManager ();
    }
    Evento matrimonio = new Evento (1L, "SPOSI",new java.util.GregorianCalendar(2012, java.util.Calendar.SEPTEMBER, 12).getTime(),
            "questo è un matrimonio", TipoEvento.NUZIALE, 20);

}
