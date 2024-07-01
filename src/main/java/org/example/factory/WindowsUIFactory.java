package org.example.factory;

import org.example.factory.components.buttons.Button;
import org.example.factory.components.buttons.WindowsButton;
import org.example.factory.components.menu.Menu;
import org.example.factory.components.menu.WindowsMenu;

public class WindowsUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }
}
