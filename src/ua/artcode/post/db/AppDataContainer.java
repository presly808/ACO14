package ua.artcode.post.db;

import ua.artcode.post.utils.MyDynamicArray;

/**
 * Created by serhii on 03.07.16.
 */
public class AppDataContainer {

    private MyDynamicArray clients;
    private MyDynamicArray tickets;
    private MyDynamicArray drivers;

    public AppDataContainer() {
        clients = new MyDynamicArray();
        tickets = new MyDynamicArray();
        drivers = new MyDynamicArray();
    }

    public MyDynamicArray getClients() {
        return clients;
    }

    public MyDynamicArray getTickets() {
        return tickets;
    }

    public MyDynamicArray getDrivers() {
        return drivers;
    }
}
