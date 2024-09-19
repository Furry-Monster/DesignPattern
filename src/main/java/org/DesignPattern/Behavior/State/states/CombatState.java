package org.DesignPattern.Behavior.State.states;

public class CombatState implements State{
    @Override
    public void init() {
        System.out.println("Combat State");
    }

    @Override
    public void onEnter() {
        System.out.println("Combat Enter");
    }

    @Override
    public void execute() {
        System.out.println("Combat Execute");
    }

    @Override
    public void onExit() {
        System.out.println("Combat Exit");
    }
}
