package me.upp.daligz.p3.client.controller;

import me.upp.daligz.p3.client.model.Model;
import me.upp.daligz.p3.client.view.View;

public class Controller {
    
    private final Model model;
    private View view;

    public Controller(final Model model, final View view) {
        this.model = model;
        this.view = view;
    }
    
    public void create() {
        view.getBtnRead().addActionListener((e) -> {
            
        });
    }
}
