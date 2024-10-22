package controller;

// import javax.swing.UIManager;
// import javax.swing.UnsupportedLookAndFeelException;
import view.FrmMain;

/**
 *
 * @author Fellipe Leonardo
 */
public class Main {
    public static void main(String[] args) {
        /*
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } 
        catch (UnsupportedLookAndFeelException | 
                ClassNotFoundException | 
                InstantiationException | 
                IllegalAccessException e) {}
        */
        
        var main = new FrmMain();
        main.setVisible(true);
    }
}
