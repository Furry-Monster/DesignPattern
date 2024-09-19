package org.DesignPattern.Sturcture.Bridge;

import org.DesignPattern.Sturcture.Bridge.Engine.Engine;

public abstract class RefinedCar extends Car {
    public RefinedCar(Engine engine) {
        super(engine);
    }

    public void drive(){
        this.engine.start();
        System.out.println("Drive " + getBrand() + " Car");
    }

    public abstract String getBrand();
}
