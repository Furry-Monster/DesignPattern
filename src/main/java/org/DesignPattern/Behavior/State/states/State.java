package org.DesignPattern.Behavior.State.states;

public interface State {

    void init();
    void onEnter();
    void execute();
    void onExit();
}
