package bankpackage;

import java.util.Scanner;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author zhaow
 */
public class Bankmanager {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("BankManagerPU");
        EntityManager em = emf.createEntityManager();
        Date dateNaiss=new Date();
        em.getTransaction().begin();
        /*Client c = new Client();
        c.setNom("AAA");
        c.setPrenom("aaa");
        c.setDateNaiss(dateNaiss);
        em.persist(c);*/
        // em.getTransaction().commit();
        em.close();
    }
}
