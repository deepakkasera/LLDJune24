package org.example.factory;

public class UIFactoryFactory {
    //This class will contain a method to create an object of
    //corresponding UIFactory based on the input parameter from the user.

    public static UIFactory getUIFactory(SupportedPlatform supportedPlatform) {
        if (supportedPlatform.equals(SupportedPlatform.ANDROID)) {
            return new AndroidUIFactory();
        } else if (supportedPlatform.equals(SupportedPlatform.IOS)) {
            return new IOSUIFactory();
        } else if (supportedPlatform.equals(SupportedPlatform.WINDOWS)) {
            return new WindowsUIFactory();
        }

        return null;
    }
}
