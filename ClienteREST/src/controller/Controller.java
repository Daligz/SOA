package controller;

import pkgRest.NewJerseyClient;

public class Controller {

    private final NewJerseyClient client;
    
    public Controller(final NewJerseyClient client) {
        this.client = client;
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
