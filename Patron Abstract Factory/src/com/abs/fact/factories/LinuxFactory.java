/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abs.fact.factories;

import com.abs.fact.ScrollBar.LinuxScrollBar;
import com.abs.fact.ScrollBar.ScrollBar;
import com.abs.fact.TextField.LinuxTextField;
import com.abs.fact.TextField.TextField;
import com.abs.fact.buttons.Button;
import com.abs.fact.buttons.LinuxButton;
import com.abs.fact.buttons.MacOSButton;
import com.abs.fact.checkboxes.Checkbox;
import com.abs.fact.checkboxes.LinuxCheckbox;
import com.abs.fact.checkboxes.MacOSCheckbox;
/**
 *
 * @author Tonny
 */
public class LinuxFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }
    
    @Override
    public ScrollBar createScrollBar() {
        return new LinuxScrollBar();
    }
    
    @Override
    public TextField createTextField() {
        return new LinuxTextField();
    }
    
}

