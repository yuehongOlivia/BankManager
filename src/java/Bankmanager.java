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
        cm.updateClient(1118,"BBBB","bbbb", "1993-01-02");
        BankbranchMetier bm = new BankbranchMetier();
        bm.updateBankb(10001, "02 Rue Chares-de-Gaulle");
        AccountMetier am = new AccountMetier();
        am.createAccount(bm.findBankb(10001), cm.findClient(1118), "FR1212345", "BBBBbbbb", "B001", 36000.00);
    }
}
