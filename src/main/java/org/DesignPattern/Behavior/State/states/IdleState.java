package org.DesignPattern.Behavior.State.states;

public class IdleState implements State {

    @Override
    public void init() {
        System.out.println("init");
    }

    @Override
    public void onEnter() {
        System.out.println("onEnter");
    }

    @Override
    public void execute() {
        System.out.println("execute");
    }

    @Override
    public void onExit() {
        System.out.println("onExit");
    }
}
