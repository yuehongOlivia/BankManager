/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import main.ClientMetier;
import main.BankbranchMetier;
import main.AccountMetier;
import main.Client;
import main.Account;
import main.BankBranch;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


/**
 *
 * @author zhaow
 */
@WebService(serviceName = "BankWS")
public class BankWS {
    ClientMetier cm = new ClientMetier();
    BankbranchMetier bm = new BankbranchMetier();
    AccountMetier am = new AccountMetier();
    
    @WebMethod(operationName = "findClientById")
    public Client findClientById(@WebParam(name = "id") int id) {
        return this.cm.findClient(id);
    }
    
    @WebMethod(operationName = "getAllClients")
    public String getAllClients() {
        return this.cm.findClients();
    }
    
    @WebMethod(operationName = "createBankBranch")
    public String createBankBranch(@WebParam(name= "code") Integer code, @WebParam(name = "adress") String adress) {
        return this.bm.createBankbranch(code, adress);
    }
    
    @WebMethod(operationName = "deleteAccount")
    public String deleteAccount(@WebParam(name = "id") int id) {
        return this.am.deleteAccount(id);
    }
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
        
    }
}
