package org.DesignPattern.Sturcture.Bridge.Engine;

public class ElectronEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Electron engine started.");
    }
}
