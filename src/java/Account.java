


import javax.persistence.*;

@Entity
public class Account {

    public Account() {

    }

    public Account(BankBranch agence, Client detenteur, String iban, String libelle, String numCompte, Double solde) {
        this.agence = agence;
        this.detenteur = detenteur;
        this.iban = iban;
        this.libelle = libelle;
        this.solde = solde;
    }

    @Id
    @Column(length = 11)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String numCompte;

    @Column(nullable = false, length = 50)
    private String libelle;

    @Column(nullable = false, length = 27)
    private String iban;

    @Column(nullable = false, length = 50, scale = 2)
    private Double solde;

    @ManyToOne
    @JoinColumn(name = "detenteur_fk")
    private Client detenteur;

    @ManyToOne
    @JoinColumn(name = "agence_fk")
    private BankBranch agence;

    public String getNumCompte() {
        return numCompte;
    }

    public String getLibelle() {
        return libelle;
    }

    public String getIban() {
        return iban;
    }

    public Double getSolde() {
        return solde;
    }

    public Client getDetenteur() {
        return detenteur;
    }

    public BankBranch getAgence() {
        return agence;
    }

    public void setNumCompte(String numCompte) {
        this.numCompte = numCompte;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public void setSolde(Double solde) {
        this.solde = solde;
    }

    public void setDetenteur(Client detenteur) {
        this.detenteur = detenteur;
    }

    public void setAgence(BankBranch agence) {
        this.agence = agence;
    }

}
