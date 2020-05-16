package com.abs.fact.factories;

import com.abs.fact.ScrollBar.ScrollBar;
import com.abs.fact.ScrollBar.WindowsScrollBar;
import com.abs.fact.TextField.TextField;
import com.abs.fact.TextField.WindowsTextField;
import com.abs.fact.buttons.Button;
import com.abs.fact.buttons.WindowsButton;
import com.abs.fact.checkboxes.Checkbox;
import com.abs.fact.checkboxes.WindowsCheckbox;

/**
 * Cada fábrica concreta extiende de la fábrica abstracta y
 * es responsable de crear los productos de una variedad específica.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
    
    @Override
    public ScrollBar createScrollBar() {
        return new WindowsScrollBar();
    }
    
    @Override
    public TextField createTextField() {
        return new WindowsTextField();
    }
}
