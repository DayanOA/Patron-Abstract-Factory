package com.abs.fact.app;

import com.abs.fact.ScrollBar.ScrollBar;
import com.abs.fact.TextField.TextField;
import com.abs.fact.buttons.Button;
import com.abs.fact.checkboxes.Checkbox;
import com.abs.fact.factories.GUIFactory;
import com.abs.fact.factories.MacOSFactory;
import com.abs.fact.factories.WindowsFactory;

/**
 * Los usuarios de Factory escogen el tipo de fábrica y el tipo de componente
 * que desean crear mediante sus interfaces, pero no interactúan con fábricas
 * concretas.
 */
public class Application {

    private Button button;
    private Checkbox checkbox;
    private ScrollBar scrollBar;
    private TextField textField;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
        scrollBar = factory.createScrollBar();
        textField = factory.createTextField();
    }

    public void paintCheckbox() {
        checkbox.paint();
    }

    public void paintButton() {
        button.paint();
    }

    public void paintScrollBar() {
        scrollBar.paint();
    }

    public void paintTextField() {
        textField.paint();
    }

}
