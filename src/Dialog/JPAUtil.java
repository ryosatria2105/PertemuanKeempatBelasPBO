package Dialog;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.Connection;
import java.sql.DriverManager;

public class JPAUtil {

    // EntityManager untuk JPA (INSERT/UPDATE/DELETE/SELECT lewat Hibernate/Eclipselink)
    private static final EntityManagerFactory emf;

    static {
        // HARUS sama seperti nama persistence-unit di persistence.xml
        emf = Persistence.createEntityManagerFactory("PBOPertemuan12PU");
    }

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }


    // Koneksi JDBC untuk JasperReport
    private static final String URL = "jdbc:postgresql://localhost:5432/DB_GYM";
    private static final String USER = "postgres";
    private static final String PASS = "masryoo21";

    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(URL, USER, PASS);
    }
}
