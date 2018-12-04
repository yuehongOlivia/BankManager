package main;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import main.BankBranch;
import main.Client;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-04T10:26:12")
@StaticMetamodel(Account.class)
public class Account_ { 

    public static volatile SingularAttribute<Account, BankBranch> agence;
    public static volatile SingularAttribute<Account, String> libelle;
    public static volatile SingularAttribute<Account, String> iban;
    public static volatile SingularAttribute<Account, Client> detenteur;
    public static volatile SingularAttribute<Account, Double> solde;
    public static volatile SingularAttribute<Account, String> numCompte;

}