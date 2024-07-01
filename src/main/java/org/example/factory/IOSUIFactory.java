package org.example.factory;

import org.example.factory.components.buttons.Button;
import org.example.factory.components.buttons.IOSButton;
import org.example.factory.components.menu.IOSMenu;
import org.example.factory.components.menu.Menu;

public class IOSUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}
