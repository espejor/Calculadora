package vista;


import javax.swing.*;
import java.awt.*;

public class Boton extends JButton {
    /**
     * Creates a button with no set text or icon.
     */
    public Boton(String str) {
        super(str);
        setFont(new Font("Calibri", Font.BOLD | Font.ITALIC,20));
    }

}
