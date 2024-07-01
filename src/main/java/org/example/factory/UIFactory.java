package org.example.factory;

import org.example.factory.components.buttons.Button;
import org.example.factory.components.menu.Menu;

public interface UIFactory {
    //Factory Methods.

    Button createButton();

    Menu createMenu();

    //createDropDown();
}
