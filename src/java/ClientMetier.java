
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;


public class ClientMetier {
    static Scanner sc = new Scanner(System.in);
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    private DAO<Client> clientDao;
    private List<Client> clients;
    
    public ClientMetier() {
        this.clientDao = new ClientDAO("BankManagerPU");
        this.clientDao.init();
    }
    
    public String findClients() {
        if (this.clients == null) {
            this.clients = clientDao.findAll();
        }
        return this.clients.stream().map(Object::toString)
                .collect(Collectors.joining(", "));
    }
    
    public Client findClient(int id) {
        Client client = this.clientDao.find(id);
        if (client == null) {
            System.out.println("Client doesn't exist");
        }
        return client;
    }
    
    public String createClient() throws ParseException {
        System.out.print("nom :");
        String nom = sc.next();
        System.out.print("prenom :");
        String prenom = sc.next();
        System.out.print("date de naissance (yyyy-MM-dd):");
         DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
         String dateN=sc.next();
        Date dateNaiss=df.parse(dateN);
        Client c = new Client(nom,prenom,dateNaiss);
        this.clientDao.create(c);
        return c.toString();
    }
    
    public String deleteClient(int id) {
        Client client = this.clientDao.find(id);
        this.clientDao.delete(client);
        return "delete Client done";
    }
    
    public String updateClient(int id,String nom, String prenom, String date) throws ParseException {
        Client c= new Client();
        c.setNumClient(id);
        c.setNom(nom);
        c.setPrenom(prenom);
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date dateN=df.parse(date);
        c.setDateNaiss(dateN);
        this.clientDao.update(c);
        return c.toString();
    } 
    
    public void endClient() {
        this.clientDao.end();
    }
}
