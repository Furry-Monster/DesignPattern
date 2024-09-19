package org.DesignPattern.Sturcture.Facade.Background;

public class Steam implements Plateform {
    private String name;
    private String password;

    @Override
    public void Register(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public void Login(String name, String password) {
        if (this.name.equals(name) && this.password.equals(password)) {
            System.out.println("Login success");
        } else {
            System.out.println("Login failed");
        }
    }

    @Override
    public void Logout(String name, String password) {
        System.out.println("Logout success");
    }
}
