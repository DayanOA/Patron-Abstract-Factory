package com.abs.fact.factories;

import com.abs.fact.ScrollBar.MacOsScrollBar;
import com.abs.fact.ScrollBar.ScrollBar;
import com.abs.fact.TextField.MacOsTextField;
import com.abs.fact.TextField.TextField;
import com.abs.fact.buttons.Button;
import com.abs.fact.buttons.MacOSButton;
import com.abs.fact.checkboxes.Checkbox;
import com.abs.fact.checkboxes.MacOSCheckbox;

/**
 * Cada fábrica concreta extiende de la fábrica abstracta y
 * es responsable de crear los productos de una variedad específica.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
    @Override
    public ScrollBar createScrollBar() {
        return new MacOsScrollBar();
    }
    
    @Override
    public TextField createTextField() {
        return new MacOsTextField();
    }
}
