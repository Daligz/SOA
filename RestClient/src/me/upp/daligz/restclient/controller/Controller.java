package me.upp.daligz.restclient.controller;

import me.upp.daligz.restclient.model.Model;
import me.upp.daligz.restclient.view.View;

public class Controller {
    
    private final View view;
    private final Model model;

    public Controller(final View view, final Model model) {
        this.view = view;
        this.model = model;
        this.registerAction();
    }
    
    private void registerAction() {
        this.create();
        this.read();
        this.update();
        this.delete();
    }
    
    private void create() {
        
    }
    
    private void read() {
        
    }
    
    private void update() {
        
    }
    
    private void delete() {
        
    }
}
