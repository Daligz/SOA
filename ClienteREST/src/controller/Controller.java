package controller;

import javax.swing.JOptionPane;
import model.Model;
import model.User;
import view.View;


public class Controller {

    private final Model model;
    private final View view;
    
    public Controller(final Model model, final View view) {
        this.model = model;
        this.view = view;
        this.register();
    }
    
    private void register() {
        this.create();
        this.read();
        this.update();
        this.delete();
        this.cancel();
    }
    
    private void create() {
        this.view.getBtnCreate().addActionListener((e) -> {
            this.model.create(new User(
                    this.view.getTxtName().getText(), 
                    this.view.getTxtUser().getText(), 
                    Integer.valueOf(this.view.getTxtPassword().getText())
            ));
        });
    }
    
    private void read() {
        this.view.getBtnRead().addActionListener((e) -> {
            final String id = JOptionPane.showInputDialog("Ingrese el id del usuario");
            final User user = this.model.read(id);
            this.view.getTxtName().setText(user.getNombre());
            this.view.getTxtUser().setText(user.getUsuario());
            this.view.getTxtPassword().setText(String.valueOf(user.getPsw()));
        });
    }
    
    private void update() {
        this.view.getBtnUpdate().addActionListener((e) -> {
            final int id = Integer.valueOf(JOptionPane.showInputDialog("Ingrese el id del usuario"));
            this.model.update(new User(
                    id,
                    this.view.getTxtName().getText(), 
                    this.view.getTxtUser().getText(), 
                    Integer.valueOf(this.view.getTxtPassword().getText())
            ));
        });
    }
    
    private void delete() {
        this.view.getBtnDelete().addActionListener((e) -> {
            final String id = JOptionPane.showInputDialog("Ingrese el id del usuario");
            this.model.delete(id);
        });
    }
    
    private void cancel() {
        this.view.getBtnCancel().addActionListener((e) -> {
            this.view.getTxtName().setText("");
            this.view.getTxtUser().setText("");
            this.view.getTxtPassword().setText("");
        });
    }
}
