package controller;

import model.Model;


public class Controller {

    private final Model model;
    
    public Controller(final Model model) {
        this.model = model;
        this.register();
    }
    
    private void register() {
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
