package main;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import main.Account;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-04T10:26:12")
@StaticMetamodel(Client.class)
public class Client_ { 

    public static volatile SingularAttribute<Client, Integer> numClient;
    public static volatile SetAttribute<Client, Account> comptes;
    public static volatile SingularAttribute<Client, Date> dateNaiss;
    public static volatile SingularAttribute<Client, String> nom;
    public static volatile SingularAttribute<Client, String> prenom;

}