package org.DesignPattern.Behavior.Responsibility.Handler;

import org.DesignPattern.Behavior.Responsibility.Request;

import java.math.BigDecimal;

public class CEOHandler implements Handler {
    @Override
    public Boolean process(Request request) {
        if(request.getAmount().compareTo(BigDecimal.valueOf(1000000))>0
                && request.getAmount().compareTo(BigDecimal.valueOf(5000000))<=0){
            System.out.println("CEOHandler approved the request");
            return true;
        }else {
            System.out.println("CEOHandler rejected the request");
            return false;
        }
    }
}
