
package bankpackage;
import javax.persistence.*;
import java.util.*;

@Entity
public class BankBranch {
    public BankBranch() {
        this.comptes=new HashSet();
    }

    public BankBranch(Integer code, String adress, Collection<Account> comptes) {
        this.code = code;
        this.adress = adress;
        this.comptes = comptes;
    }
    
    
    @Id
    @Column(length = 5)
    private Integer code;
    
    @Column(nullable=false,length=50,unique=true)
    private String adress;
    
    @OneToMany(mappedBy = "agence")
    private Collection <Account> comptes;

    public Integer getCode() {
        return code;
    }

    public String getAdress() {
        return adress;
    }

    public Collection<Account> getComptes() {
        return comptes;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setComptes(Collection<Account> comptes) {
        this.comptes = comptes;
    }
    
    
}
