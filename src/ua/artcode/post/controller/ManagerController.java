package ua.artcode.post.controller;

import ua.artcode.post.db.AppDataContainer;
import ua.artcode.post.model.*;

/**
 * Created by serhii on 02.07.16.
 */
public class ManagerController {

    private AppDataContainer appDataContainer;

    public ManagerController(AppDataContainer appDataContainer) {
        this.appDataContainer = appDataContainer;
    }

    public PostTicket createTicket(Client client, Product[] products,
                        Address from, Address to){
        return null;
    }

    public PostTicket[] filterTicketsById(String id){
        return null;
    }


    public PostTicket[] filterTicketsByClientPhone(String phone){
        return null;
    }

    public PostTicket getTicketById(String id){
        return null;
    }

    public Client getClient(String phone){
        Object[] clientArr = appDataContainer.getClients().toArray();
        for (int i = 0; i < clientArr.length; i++) {
            Client iterClient = (Client) clientArr[i];
            if(iterClient.getPhone().equals(phone)){
                return iterClient;
            }
        }

        return null;// no client with phone
    }

    public Client addClient(Passport passport, String phone){
        // take data
        // create client instance, wrap in data into client instance
        // save client to a bd(list)
        // return saved client

        // validation of input data
        Client client = new Client(phone, passport);
        appDataContainer.getClients().add(client);
        return client;
    }

}
