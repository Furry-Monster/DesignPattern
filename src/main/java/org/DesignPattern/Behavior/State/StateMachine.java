package org.DesignPattern.Behavior.State;

import org.DesignPattern.Behavior.State.states.IdleState;
import org.DesignPattern.Behavior.State.states.State;

public class StateMachine {
    private State currentState;

    public StateMachine() {
        changeState(new IdleState());
    }

    public void changeState(State newState) {
        State oldState = this.currentState;
        oldState.onEnter();
        this.currentState = newState;
        newState.onEnter();
    }

    public void execute(){
        this.currentState.execute();
    }
}
