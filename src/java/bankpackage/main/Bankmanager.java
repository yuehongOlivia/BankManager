package bankpackage.main;

import bankpackage.tables.Client;
import bankpackage.metier.*;
import java.text.ParseException;

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

    public static void main(String[] args) throws ParseException {
        ClientMetier cm = new ClientMetier();
        cm.createClient();
        cm.endClient();
        /*
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("BankManagerPU");
        EntityManager em = emf.createEntityManager();
        Date dateNaiss=new Date();
        em.getTransaction().begin();
        Client c = new Client();
        c.setNom("AAA");
        c.setPrenom("aaa");
        c.setDateNaiss(dateNaiss);
        Client c2 = new Client();
        c2.setNom("BBB");
        c2.setPrenom("bbb");
        c2.setDateNaiss(dateNaiss);
        em.persist(c);
        em.persist(c2);
        em.getTransaction().commit();
        em.close();*/
    }
}
