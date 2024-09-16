package controller;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import view.FrmLogin;
import view.FrmMain;
import view.FrmPainelControle;

/**
 *
 * @author Fellipe Leonardo
 */
public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } 
        catch (UnsupportedLookAndFeelException | 
                ClassNotFoundException | 
                InstantiationException | 
                IllegalAccessException e) {}
        
        var main = new FrmPainelControle();
        main.setVisible(true);
    }
}
