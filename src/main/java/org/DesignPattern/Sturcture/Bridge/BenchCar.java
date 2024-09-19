package org.DesignPattern.Sturcture.Bridge;

import org.DesignPattern.Sturcture.Bridge.Engine.Engine;

public class BenchCar extends RefinedCar{
    public BenchCar(Engine engine) {
        super(engine);
    }

    @Override
    public String getBrand() {
        return "Bench";
    }
}
