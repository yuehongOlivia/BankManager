package main;

import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

@XmlRootElement
@Entity
public class Client {

    public Client() {
    }

    public Client(String nom, String prenom, Date dateNaiss) {
        this.dateNaiss = dateNaiss;
        this.nom = nom;
        this.prenom = prenom;
    }

    @Id
    @Column(length = 8)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer numClient;

    @Column(nullable = false, length = 30)
    private String nom;

    
    @Column(nullable = false, length = 30)
    private String prenom;

    
    @Column(name = "DateNaissance", nullable = false)
    private Date dateNaiss = new Date();


    @OneToMany(mappedBy = "detenteur")
    private Set<Account> comptes = new HashSet<Account>();

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

    @XmlTransient
    public Set<Account> getComptes() {
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

    public void setComptes(Set<Account> comptes) {
        this.comptes = comptes;
    }
    /*
    void setDateNaiss(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

}
