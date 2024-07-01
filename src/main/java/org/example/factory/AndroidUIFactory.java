package org.example.factory;

import org.example.factory.components.buttons.AndroidButton;
import org.example.factory.components.buttons.Button;
import org.example.factory.components.menu.AndroidMenu;
import org.example.factory.components.menu.Menu;

public class AndroidUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
