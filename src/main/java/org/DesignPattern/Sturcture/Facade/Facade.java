package org.DesignPattern.Sturcture.Facade;

import org.DesignPattern.Sturcture.Facade.Background.GameProcess;

public class Facade {
    public GameProcess openGame() {
        //TODO: 開啟遊戲流程
        return new GameProcess();
    }
}
