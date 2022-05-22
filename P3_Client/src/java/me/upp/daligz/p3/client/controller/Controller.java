package me.upp.daligz.p3.client.controller;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import me.upp.daligz.p3.client.model.Model;
import me.upp.daligz.p3.client.model.commons.User;
import me.upp.daligz.p3.client.view.View;

public class Controller {
    
    private final Model model;
    private final View view;

    public Controller(final Model model, final View view) {
        this.model = model;
        this.view = view;
        this.registerActions();
    }
    
    private void registerActions() {
        this.create();
    }
    
    private void create() {
        this.view.getBtnCreate().addActionListener((e) -> {
            if (isEmpty(this.view.getTxtName(), this.view.getTxtPassword(), this.view.getTxtUser())) {
                this.alert("Error", "No puedes dejar campos vacios!", JOptionPane.ERROR_MESSAGE);
                return;
            }
            this.model.create(
                    this.view.getTxtName().getText(), 
                    this.view.getTxtPassword().getText(),
                    Integer.valueOf(this.view.getTxtPassword().getText())
            );
            this.alert("Exitoso", "Se agrego un nuevo usuario!", JOptionPane.INFORMATION_MESSAGE);
        });
    }
    
    private void alert(final String title, final String message, final int jOptionPaneIcon) {
        JOptionPane.showMessageDialog(null, message, title, jOptionPaneIcon);
    }
    
    private boolean isEmpty(final JTextField... fields) {
        for (final JTextField field : fields) if (field.getText().isEmpty()) return true;
        return false;
    }
    
    private void clear() {
        this.view.getTxtName().setText("");
        this.view.getTxtPassword().setText("");
        this.view.getTxtUser().setText("");
    }
}
