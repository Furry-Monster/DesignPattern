package org.DesignPattern.Sturcture.Bridge;

import org.DesignPattern.Sturcture.Bridge.Engine.Engine;

public abstract class Car {
    // Engine type
    protected Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public abstract void drive();
}
