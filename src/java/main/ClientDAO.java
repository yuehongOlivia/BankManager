package main;

import java.util.List;


public class ClientDAO extends DAO<Client> {
    public ClientDAO(String enM) {
        super(enM);
    }

    public void init() {
        this.em.getTransaction().begin();
    }

     public List<Client> findAll() {
        return em.createQuery("select c from Client c").getResultList();
    }
    
    @Override
    public Client find(int id) {
       return em.find(Client.class,id);
    }

    public void end() {
        this.em.getTransaction().commit();
        this.em.close();
    }

    @Override
    public Client create(Client obj) {
        em.persist(obj);
        em.getTransaction().commit();
        return obj;
    }

    @Override
    public Client delete(Client obj) {
        obj = em.merge(obj);
        em.remove(obj);
        em.getTransaction().commit();
        return obj;
    }
    
    @Override
    public Client update(Client obj) {
        obj=em.merge(obj);
        return obj;
    }
    
}
