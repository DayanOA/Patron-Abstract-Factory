package com.abs.fact.factories;

import com.abs.fact.ScrollBar.ScrollBar;
import com.abs.fact.TextField.TextField;
import com.abs.fact.buttons.Button;
import com.abs.fact.checkboxes.Checkbox;

/**
 * La fábrica abstracta (Interfaz) conoce los tipos de productos que se crean.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
    ScrollBar createScrollBar();
    TextField createTextField();
}

