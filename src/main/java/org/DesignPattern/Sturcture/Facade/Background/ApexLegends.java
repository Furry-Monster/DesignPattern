package org.DesignPattern.Sturcture.Facade.Background;

public class ApexLegends implements Game {
    @Override
    public void Start() {
        System.out.println("Apex Legends,Start on!");
    }

    @Override
    public void Update() {
        while (true) {
            System.out.println("Apex Legends,Update!");
        }
    }

    @Override
    public void FixedUpdate() {
        while (true) {
            System.out.println("Apex Legends,FixedUpdate!");
        }
    }

    @Override
    public void LateUpdate() {
        while (true) {
            System.out.println("Apex Legends,LateUpdate!");
        }
    }
}
