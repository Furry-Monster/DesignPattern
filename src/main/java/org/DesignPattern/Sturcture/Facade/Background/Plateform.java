package org.DesignPattern.Sturcture.Facade.Background;

public interface Plateform {
    public void Register(String name, String password);
    public void Login(String name, String password);
    public void Logout(String name, String password);
}
