package org.example.factory;

public class Flutter {
    //Non Factory methods.

    void refreshUI() {
        System.out.println("Refreshing UI");
    }

    void setTheme() {
        System.out.println("Setting theme");
    }

    //factory method to get the object of corresponding
    //UI Factory based on the user input.
    public UIFactory createUIFactory(SupportedPlatform supportedPlatform) {
        return UIFactoryFactory.getUIFactory(supportedPlatform);
    }
}
