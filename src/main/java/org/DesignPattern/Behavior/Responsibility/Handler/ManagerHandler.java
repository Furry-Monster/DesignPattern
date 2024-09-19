package org.DesignPattern.Behavior.Responsibility.Handler;

import org.DesignPattern.Behavior.Responsibility.Request;

import java.math.BigDecimal;

public class ManagerHandler implements Handler {
    @Override
    public Boolean process(Request request) {
        if (request.getAmount().compareTo(BigDecimal.valueOf(1000)) > 0) {
            System.out.println("ManagerHandler reject request");
            return null;
        } else {
            // 名叫bob的请求不处理
            return !request.getName().equalsIgnoreCase("bob");
        }
    }
}
