package org.DesignPattern.Behavior.Observer;

public class ProductObserver {
    public void onPublished(Product p) {
        System.out.println(p+" is published");
    }

    public void onPriceChanged(Product p) {
        System.out.println(p+" is price changed");
    }
}
