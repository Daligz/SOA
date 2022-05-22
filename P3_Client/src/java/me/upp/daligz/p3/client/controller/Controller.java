package me.upp.daligz.p3.client.controller;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import me.upp.daligz.p3.backend.model.tables.TblUsers;
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
        this.read();
        this.update();
        this.delete();
        this.cancel();
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
    
    private void read() {
        this.view.getBtnRead().addActionListener((e) -> {
            final String id = JOptionPane.showInputDialog("Ingrese el id del usuario");
            try {
                final User user = this.model.read(Integer.parseInt(id));
                this.view.getTxtName().setText(user.getName());
                this.view.getTxtUser().setText(user.getUser());
                this.view.getTxtPassword().setText(String.valueOf(user.getPassword()));
                this.alert("Exitoso", "El usuario con el id " + user.getId() + " fue encontrado!", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException ignored) {
                this.alert("Error", "Usuario no valido!", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
    
    private void update() {
        this.view.getBtnUpdate().addActionListener((e) -> {
            if (isEmpty(this.view.getTxtName(), this.view.getTxtPassword(), this.view.getTxtUser())) {
                this.alert("Error", "No puedes dejar campos vacios!", JOptionPane.ERROR_MESSAGE);
                return;
            }
            try {
                final int id = Integer.valueOf(JOptionPane.showInputDialog("Ingrese el id del usuario"));
                this.model.update(id, TblUsers.NAME.getValue(), this.view.getTxtName().getText());
                this.model.update(id, TblUsers.USER.getValue(), this.view.getTxtUser().getText());
                this.model.update(id, TblUsers.PASSWORD.getValue(), this.view.getTxtPassword().getText());
                this.alert("Exitoso", "Usuario actualizado!", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception ignored) {
                this.alert("Error", "El usuario no fue encontrado!", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
    
    private void delete() {
        this.view.getBtnDelete().addActionListener((e) -> {
            try {
                final int id = Integer.valueOf(JOptionPane.showInputDialog("Ingrese el id del usuario"));
                this.model.delete(id);
                this.alert("Exitoso", "El usuario con el id " + id + " fue eliminado!", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception ignored) {
                this.alert("Error", "Usuario no encontrado", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
    
    private void cancel() {
        this.view.getBtnCancel().addActionListener((e) -> {
            this.clear();
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
