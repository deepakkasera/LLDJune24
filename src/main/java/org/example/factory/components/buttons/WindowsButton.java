package org.example.factory.components.buttons;

public class WindowsButton implements Button {
    @Override
    public void click() {
        System.out.println("Windows button clicking");
    }

    @Override
    public void changeSize() {
        System.out.println("Windows button changing size");
    }
}
