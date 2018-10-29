package bankpackage;

import javax.persistence.*;
import java.util.*;

@Entity
public class Client {

    public Client() {
        this.comptes = new HashSet();
    }

    public Client(Integer numClient, String nom, String prenom, Date dateNaiss, Collection<Account> comptes) {
        this.dateNaiss = dateNaiss;
        this.nom = nom;
        this.prenom = prenom;
        this.comptes = comptes;
    }
    
    @Id
    @Column(length = 8)
    private Integer numClient;

    @Column(nullable = false, length = 30)
    private String nom;

    @Column(nullable = false, length = 30)
    private String prenom;

    @Column(name = "DateNaissance", nullable = false, length = 30)
    private Date dateNaiss = new Date();

    @OneToMany(mappedBy = "detenteur")
    private Collection<Account> comptes;

    public Integer getNumClient() {
        return numClient;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Date getDateNaiss() {
        return dateNaiss;
    }

    public Collection<Account> getComptes() {
        return comptes;
    }

    public void setNumClient(Integer numClient) {
        this.numClient = numClient;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDateNaiss(Date dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

    public void setComptes(Collection<Account> comptes) {
        this.comptes = comptes;
    }

}
