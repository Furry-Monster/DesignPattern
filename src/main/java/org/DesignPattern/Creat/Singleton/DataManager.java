package org.DesignPattern.Creat.Singleton;

public class DataManager {
    private static DataManager INSTANCE = new DataManager();

    private DataManager() {
    }

    public static DataManager getInstance() {
        return INSTANCE;
    }
}
