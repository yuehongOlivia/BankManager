package main;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BankbranchMetier {
    static Scanner sc = new Scanner(System.in);
    private DAO<BankBranch> bankbDao;
    private List<BankBranch> banks;

    public BankbranchMetier() {
        this.bankbDao = new BankbranchDAO("BankManagerPU");
        this.bankbDao.init();
    }

    public String findBankbs() {
        if (this.banks == null) {
            this.banks = bankbDao.findAll();
            return "No bankbranches in the database";
        }
        return this.banks.stream().map(Object::toString)
                .collect(Collectors.joining(", "));
    }

    public BankBranch findBankb(int id) {
        BankBranch b = this.bankbDao.find(id);
        if (b == null) {
            System.out.println("Wrong bankbranch");
        }
        return b;
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

    public void endBankb() {
        this.bankbDao.end();
    }    
}
