package me.upp.daligz.p3.client;

import java.awt.EventQueue;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import me.upp.daligz.p3.client.controller.Controller;
import me.upp.daligz.p3.client.model.Model;
import me.upp.daligz.p3.client.view.View;

public class Client {
    
    public static void main(final String args[]) {
        try {
            for (final UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }

        EventQueue.invokeLater(() -> {
            final Model model = new Model();
            final View view = new View();
            final Controller controller = new Controller(model, view);
            
            view.setVisible(true);
        });
    }
}