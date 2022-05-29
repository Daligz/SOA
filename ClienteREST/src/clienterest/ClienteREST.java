package clienterest;

import java.awt.EventQueue;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import view.View;

public class ClienteREST {

    public static void main(String[] args) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }

        EventQueue.invokeLater(() -> {
            new View().setVisible(true);
        });
    }    
}
