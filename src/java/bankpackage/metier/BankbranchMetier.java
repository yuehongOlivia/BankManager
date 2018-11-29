package bankpackage.metier;
import bankpackage.DAOs.BankbranchDAO;
import bankpackage.DAOs.DAO;
import bankpackage.tables.BankBranch;
import bankpackage.tables.Account;
import java.util.List;
import java.util.stream.Collectors;

public class BankbranchMetier {
    private DAO<BankBranch> bankbDao;
    private List<BankBranch> banks;

    public BankbranchMetier() {
        this.bankbDao = new BankbranchDAO("BankManagerPU");
    }

    public String findBankbs() {
        if (this.banks == null) {
            this.banks = bankbDao.findAll();
            return "No bankbranches in the database";
        }
        return this.banks.stream().map(Object::toString)
                .collect(Collectors.joining(", "));
    }

    public String findBankb(int id) {
        BankBranch b = this.bankbDao.find(id);
        if (b == null) {
            return "Wrong bankbranch";
        }
        return b.getAdress();
    }

    public String createBankbranch(Integer code, String adress) {
        BankBranch b=new BankBranch(code,adress);
        this.bankbDao.create(b);
        return b.getAdress();
    }
    
    public String deleteBankb(int id) {
        BankBranch b = this.bankbDao.find(id);
        this.bankbDao.delete(b);
        return "Delete bankbranch done";
    }
    
    public String updateBankb(Integer code, String adress) {
        BankBranch b = new BankBranch();
        b.setCode(code);
        b.setAdress(adress);
        
        this.bankbDao.update(b);
        return b.getAdress();
    }
    
    public String addAccount(BankBranch b,Account a) {
        b.getComptes().add(a);
        this.bankbDao.update(b);
        return a.getNumCompte().toString();
    } 

    public void endAccount() {
        this.bankbDao.end();
    }    
}
