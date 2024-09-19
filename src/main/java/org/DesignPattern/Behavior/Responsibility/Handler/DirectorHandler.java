package org.DesignPattern.Behavior.Responsibility.Handler;

import org.DesignPattern.Behavior.Responsibility.Request;

import java.math.BigDecimal;

public class DirectorHandler implements Handler {
    @Override
    public Boolean process(Request request) {
        if(request.getAmount().compareTo(BigDecimal.valueOf(10000))>0) {
            System.out.println("Director reject the request");
            return null;
        }else {
            System.out.println("Director accept the request");
            return true;
        }
    }
}
