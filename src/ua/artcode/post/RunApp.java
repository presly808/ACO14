package ua.artcode.post;

import ua.artcode.post.controller.DirectorController;
import ua.artcode.post.controller.ManagerController;
import ua.artcode.post.db.AppDataContainer;

/**
 * Created by serhii on 03.07.16.
 */
public class RunApp {

    public static void main(String[] args) {
        AppDataContainer appDataContainer = new AppDataContainer();

        DirectorController directorController = new DirectorController(appDataContainer);
        ManagerController managerController = new ManagerController(appDataContainer);
    }

}
