package ua.artcode.post.controller;

import ua.artcode.post.model.Address;
import ua.artcode.post.model.Client;
import ua.artcode.post.model.PostTicket;
import ua.artcode.post.model.Product;

/**
 * Created by serhii on 02.07.16.
 */
public class ManagerController {


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
        return null;
    }

}
