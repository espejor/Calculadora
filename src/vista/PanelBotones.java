package vista;

import controlador.Controlador;

import javax.swing.*;
import java.awt.*;

public class PanelBotones extends JPanel {
    private String botones[] = {"1","2","3","+","4","5","6","-","7","8","9","*","+/-","0",".","/"};
    private Boton botonesClass[] = new Boton[botones.length];
    /**
     * Creates a new <code>JPanel</code> with a double buffer
     * and a flow layout.
     */
    public PanelBotones() {
        setLayout(new GridLayout(4, 4));

        for (int i = 0; i < 16; i++) {
            botonesClass[i] = new Boton(botones[i]);
            add(botonesClass[i]);
        }
    }

    public void setControlador(Controlador controlador){
        for (Boton boton: botonesClass){
            boton.addActionListener(controlador);
        }
    }
}
