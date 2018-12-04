package main;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import main.Account;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-04T10:26:12")
@StaticMetamodel(BankBranch.class)
public class BankBranch_ { 

    public static volatile SingularAttribute<BankBranch, Integer> code;
    public static volatile SetAttribute<BankBranch, Account> comptes;
    public static volatile SingularAttribute<BankBranch, String> adress;

}