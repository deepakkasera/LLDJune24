package org.example.factory;

import org.example.factory.components.buttons.Button;
import org.example.factory.components.menu.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.createUIFactory(SupportedPlatform.ANDROID);

        Button button = uiFactory.createButton();
        button.click();
        button.changeSize();

        Menu menu = uiFactory.createMenu();
        menu.showMenu();
    }
}
