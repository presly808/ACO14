package ua.artcode.post.controller;

import ua.artcode.post.db.AppDataContainer;
import ua.artcode.post.model.Client;
import ua.artcode.post.utils.MyDynamicArray;

/**
 * Created by serhii on 03.07.16.
 */
public class DirectorController {

    private AppDataContainer appDataContainer;

    public DirectorController(AppDataContainer appDataContainer) {
        this.appDataContainer = appDataContainer;
    }

    public AppDataContainer getAppDataContainer() {
        return appDataContainer;
    }

    public void setAppDataContainer(AppDataContainer appDataContainer) {
        this.appDataContainer = appDataContainer;
    }
}
