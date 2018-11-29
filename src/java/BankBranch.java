



import javax.persistence.*;
import java.util.*;

@Entity
public class BankBranch {
    public BankBranch() {
    }

    public BankBranch(Integer code, String adress) {
        this.code = code;
        this.adress = adress;
    }
    
    
    @Id
    @Column(length = 5)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer code;
    
    @Column(nullable=false,length=50,unique=true)
    private String adress;
    
    @OneToMany(mappedBy = "agence")
    private Set <Account> comptes=new HashSet<Account>();

    public Integer getCode() {
        return code;
    }

    public String getAdress() {
        return adress;
    }

    public Set<Account> getComptes() {
        return comptes;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setComptes(Set<Account> comptes) {
        this.comptes = comptes;
    }
    
    
}
