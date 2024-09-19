package org.DesignPattern.Sturcture.Wrapper;

import java.util.concurrent.Callable;

public class RunnableWrapper implements Runnable {
    // get reference
    private Callable<?> callable;
    public RunnableWrapper(Callable<?> callable) {
        this.callable = callable;
    }

    // implement run() method
    @Override
    public void run() {
        try {
            callable.call();
        }catch(Exception e) {
            throw new RuntimeException(e);
        }
    }
}
