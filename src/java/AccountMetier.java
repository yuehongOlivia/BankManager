import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AccountMetier {
    static Scanner sc = new Scanner(System.in);
    private DAO<Account> accountDao;
    private List<Account> accounts;

    public AccountMetier() {
        this.accountDao = new AccountDAO("BankManagerPU");
        this.accountDao.init();
    }

    public String findAccounts() {
        if (this.accounts == null) {
            this.accounts = accountDao.findAll();
            return "No accounts in the database";
        }
        return this.accounts.stream().map(Object::toString)
                .collect(Collectors.joining(", "));
    }

    public Account findAccount(int id) {
        Account account = this.accountDao.find(id);
        if (account == null) {
            System.out.println("not exist in the database");;
        }
        return account;
    }

    public String createAccount(BankBranch agence, Client detenteur, 
            String iban, String libelle, String numCompte, Double solde) {
        Account a=new Account(agence,detenteur,iban,libelle,numCompte,solde);
        this.accountDao.create(a);
        return a.toString();
    }
    
    public String deleteAccount(int id) {
        Account a = this.accountDao.find(id);
        this.accountDao.delete(a);
        return "Delete account done";
    }
    
    public String updateAccount(BankBranch agence, Client detenteur, 
            String iban, String libelle, String numCompte, Double solde) {
        Account a = new Account();
        a.setAgence(agence);
        a.setDetenteur(detenteur);
        a.setIban(iban);
        a.setLibelle(libelle);
        a.setNumCompte(numCompte);
        a.setSolde(solde);
        this.accountDao.update(a);
        return a.toString();
    }

    public void endAccount() {
        this.accountDao.end();
    }
}
