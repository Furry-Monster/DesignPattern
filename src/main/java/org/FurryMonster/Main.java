package org.FurryMonster;

import java.time.*;
import java.util.concurrent.Callable;

import org.DesignPattern.Creat.StaticFactory.LocalDateFactory;
import org.DesignPattern.Sturcture.Wrapper.RunnableWrapper;
import org.DesignPattern.Sturcture.Wrapper.Task;

public class Main {
    public static void main(String[] args) {
        Callable<Long> callable = new Task(123450000L);
        Thread thread = new Thread(new RunnableWrapper(callable)); // compile error!
        thread.start();
    }
}