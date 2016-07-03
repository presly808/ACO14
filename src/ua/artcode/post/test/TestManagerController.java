package ua.artcode.post.test;

import ua.artcode.post.controller.ManagerController;
import ua.artcode.post.db.AppDataContainer;
import ua.artcode.post.model.Client;
import ua.artcode.post.model.Passport;

/**
 * Created by serhii on 03.07.16.
 */
public class TestManagerController {

    public static void main(String[] args) {

        testAddClient();
        System.out.println();
        testGetClient();
        // test 2 get client

    }

    private static void testGetClient() {
        ManagerController managerController = new ManagerController(new AppDataContainer());

        // prepare data for test
        managerController.addClient(new Passport("UE23412", "Serhii Bilobrov"),"0933091219");

        String in = "0933091219";
        Client expected =
                new Client("0933091219", new Passport("UE23412", "Serhii Bilobrov"));

        Client actual = managerController.getClient(in);

        System.out.printf("%s, test get client in %s ,\n expected %s,\n actual %s\n",
                actual.toString().equals(expected.toString()), in, expected, actual);
    }

    public static void testAddClient(){
        ManagerController managerController = new ManagerController(new AppDataContainer());
        Passport in1 = new Passport("UE23412", "Serhii Bilobrov");
        String in2 = "0933091219";
        Client expected =
                new Client("0933091219", new Passport("UE23412", "Serhii Bilobrov"));

        Client actual = managerController.addClient(
                in1, in2);

        System.out.printf("%s, test add client in1 %s ,\n expected %s,\n actual %s\n",
                actual.toString().equals(expected.toString()), in1, expected, actual);
    }
}
