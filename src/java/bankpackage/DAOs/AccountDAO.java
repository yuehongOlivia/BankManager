package bankpackage.DAOs;
import bankpackage.tables.Account;
import java.util.List;
/**
 *
 * @author zhaow
 */
public class AccountDAO extends DAO<Account>{
    public AccountDAO (String enM) {
        super(enM);
    }
    
    public void init() {
        this.em.getTransaction().begin();
    }

     public List<Account> findAll() {
        return em.createQuery("select a from Account a").getResultList();
    }
    
    @Override
    public Account find(int id) {
       return em.find(Account.class,id);
    }

    public void end() {
        this.em.getTransaction().commit();
        this.em.close();
    }

    @Override
    public Account create(Account obj) {
        em.persist(obj);
        em.getTransaction().commit();
        return obj;
    }

    @Override
    public Account delete(Account obj) {
        obj = em.merge(obj);
        em.remove(obj);
        em.getTransaction().commit();
        return obj;
    }
    
    @Override
    public Account update(Account obj) {
        obj=em.merge(obj);
        return obj;
    }
    
}
