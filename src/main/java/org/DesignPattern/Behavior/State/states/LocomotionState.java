package org.DesignPattern.Behavior.State.states;

public class LocomotionState implements State {
    @Override
    public void init() {
        System.out.println("Locomotion State init");
    }

    @Override
    public void onEnter() {
        System.out.println("Locomotion State onEnter");
    }

    @Override
    public void execute() {
        System.out.println("Locomotion State execute");
    }

    @Override
    public void onExit() {
        System.out.println("Locomotion State onExit");
    }
}
