package me.upp.daligz.restclient;

import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import me.upp.daligz.restclient.controller.Controller;
import me.upp.daligz.restclient.model.Model;
import me.upp.daligz.restclient.view.View;

public class Client {

    public static void main(final String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (final ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            final Model model = new Model();
            final View view = new View();
            final Controller controller = new Controller(view, model);
            view.setVisible(true);
        });
    }
}
