package vista;


import javax.swing.*;
import java.awt.*;

public class PanelDisplay extends JPanel {

    /**
     * Creates a new <code>JPanel</code> with a double buffer
     * and a flow layout.
     * @param display Display de la calculadora
     */
    public PanelDisplay(JTextField display) {
        display.setEditable(false);
        display.setBackground(Color.WHITE);
        display.setFont(new Font("Calibri",Font.BOLD,20));
        add(display);
    }

}
