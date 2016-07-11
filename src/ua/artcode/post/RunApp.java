package ua.artcode.post;

import ua.artcode.post.controller.DirectorController;
import ua.artcode.post.controller.IManagerController;
import ua.artcode.post.controller.ManagerController;
import ua.artcode.post.db.AppDataContainer;

public class RunApp {

    public static void main(String[] args) {
        AppDataContainer appDataContainer = new AppDataContainer();

        DirectorController directorController = new DirectorController(appDataContainer);
        IManagerController managerController = new ManagerController(appDataContainer);
    }

}
