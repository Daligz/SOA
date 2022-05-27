package me.upp.daligz.restclient.controller;

import javax.swing.JOptionPane;
import me.upp.daligz.restclient.model.Model;
import me.upp.daligz.restclient.view.View;
import me.upp.library.intelligod.commons.User;
import me.upp.library.intelligod.tables.TblUsers;

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
        this.view.getBtnCreate().addActionListener((e) -> {
            this.model.create(
                    this.view.getTxtName().getText(),
                    this.view.getTxtUser().getText(),
                    Integer.valueOf(this.view.getTxtPassword().getText())
            );
        });
    }
    
    private void read() {
        this.view.getBtnRead().addActionListener((e) -> {
            final int id = Integer.valueOf(JOptionPane.showInputDialog("Ingrese el id del usuario"));
            final User user = this.model.read(id);
            this.view.getTxtName().setText(user.getName());
            this.view.getTxtUser().setText(user.getUser());
            this.view.getTxtPassword().setText(String.valueOf(user.getPassword()));
        });
    }
    
    private void update() {
        this.view.getBtnUpdate().addActionListener((e) -> {
            final int id = Integer.valueOf(JOptionPane.showInputDialog("Ingrese el id del usuario"));
            this.model.update(id, TblUsers.NAME.getValue(), this.view.getTxtName().getText());
            this.model.update(id, TblUsers.USER.getValue(), this.view.getTxtUser().getText());
            this.model.update(id, TblUsers.PASSWORD.getValue(), this.view.getTxtPassword().getText());
        });
    }
    
    private void delete() {
        this.view.getBtnDelete().addActionListener((e) -> {
            final int id = Integer.valueOf(JOptionPane.showInputDialog("Ingrese el id del usuario"));
            this.model.delete(id);
        });
    }
}
