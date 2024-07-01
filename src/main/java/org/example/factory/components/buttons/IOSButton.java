package org.example.factory.components.buttons;

public class IOSButton implements Button {
    @Override
    public void click() {
        System.out.println("IOS button clicking");
    }

    @Override
    public void changeSize() {
        System.out.println("IOS button changing size");
    }
}
