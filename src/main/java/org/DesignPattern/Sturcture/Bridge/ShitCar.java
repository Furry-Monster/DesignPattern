package org.DesignPattern.Sturcture.Bridge;

import org.DesignPattern.Sturcture.Bridge.Engine.Engine;

public class ShitCar extends RefinedCar{
    public ShitCar(Engine engine) {
        super(engine);
    }

    @Override
    public String getBrand() {
        return "Shit";
    }
}
