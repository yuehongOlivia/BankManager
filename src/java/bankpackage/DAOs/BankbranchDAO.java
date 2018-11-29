package bankpackage.DAOs;

import bankpackage.tables.BankBranch;
import java.util.List;


public class BankbranchDAO extends DAO<BankBranch>{
     public BankbranchDAO (String enM) {
        super(enM);
    }
    
    public void init() {
        this.em.getTransaction().begin();
    }

     public List<BankBranch> findAll() {
        return em.createQuery("select b from BankBranch b").getResultList();
    }
    
    @Override
    public BankBranch find(int id) {
       return em.find(BankBranch.class,id);
    }

    public void end() {
        this.em.getTransaction().commit();
        this.em.close();
    }

    @Override
    public BankBranch create(BankBranch obj) {
        em.persist(obj);
        em.getTransaction().commit();
        return obj;
    }

    @Override
    public BankBranch delete(BankBranch obj) {
        obj = em.merge(obj);
        em.remove(obj);
        em.getTransaction().commit();
        return obj;
    }
    
    @Override
    public BankBranch update(BankBranch obj) {
        obj=em.merge(obj);
        return obj;
    }

}
