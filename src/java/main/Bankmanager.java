package main;

import java.text.ParseException;
import java.util.Scanner;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Bankmanager {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws ParseException {
        
        ClientMetier cm = new ClientMetier();
        System.out.println(cm.findClient(1118).getNom());
        //cm.createClient();
        // cm.updateClient(1118,"BBBB","bbbb", "1993-01-02");
        // BankbranchMetier bm = new BankbranchMetier();
        // bm.createBankbranch(10001, "01 Rue Charles-de-Gaulle");
        // bm.updateBankb(10001, "02 Rue Chares-de-Gaulle");
        // AccountMetier am = new AccountMetier();
        //faut tester au fur à messure
        // am.createAccount(bm.findBankb(10001), cm.findClient(1118), "FR1212345", "BBBBbbbb", "B001", 36000.00);
    }
}
