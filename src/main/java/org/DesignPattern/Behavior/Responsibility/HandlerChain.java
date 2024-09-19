package org.DesignPattern.Behavior.Responsibility;

import org.DesignPattern.Behavior.Responsibility.Handler.Handler;

import java.util.ArrayList;
import java.util.List;

public class HandlerChain {
    private List<Handler> handlerChain = new ArrayList<Handler>();

    public void addHandler(Handler handler) {
        handlerChain.add(handler);
    }

    public boolean process(Request request) {
        // 依次调用每个Handler:
        for (Handler handler : handlerChain) {
            Boolean reply = handler.process(request);
            if (reply != null) {
                // 如果返回TRUE或FALSE，处理结束:
                System.out.println(request + " " + (reply ? "Approved by " : "Denied by ") + handler.getClass().getSimpleName());
                return reply;
            }
        }
        throw new RuntimeException("Could not handle request: " + request);
    }
}
