package ua.artcode.post.controller;

import ua.artcode.post.model.*;

/**
 * Created by serhii on 09.07.16.
 */
public interface IManagerController {
    PostTicket createTicket(Client client, Product[] products,
                            Address from, Address to);

    PostTicket[] filterTicketsById(String id);

    PostTicket[] filterTicketsByClientPhone(String phone);

    PostTicket getTicketById(String id);

    Client getClient(String phone);

    Client addClient(Passport passport, String phone);
}
