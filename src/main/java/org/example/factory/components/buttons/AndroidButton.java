package org.example.factory.components.buttons;

public class AndroidButton implements Button {
    @Override
    public void click() {
        System.out.println("Android button clicking");
    }

    @Override
    public void changeSize() {
        System.out.println("Android button changing size");
    }
}
