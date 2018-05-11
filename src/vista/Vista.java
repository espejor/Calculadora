package vista;

import controlador.Controlador;

import javax.swing.*;
import java.awt.*;

public class Vista extends JFrame implements IVista{

    private JTextField display = new JTextField(15);
    private PanelBotones panelBotonesNumeros;
    private Boton equal;

    // Instancia de la misma clase Vista
    private static Vista ourInstance = new Vista("Calculadora");

    // Único punto de creación de una instancia de Vista
    public static Vista getInstance() {
        return ourInstance;
    }

    // Constructor privado de Vista
    private Vista(String title) {
        super(title);

        JPanel panelDisplay = new PanelDisplay(display);
        panelBotonesNumeros = new PanelBotones();
        equal = new Boton("=");

        add(panelDisplay, BorderLayout.NORTH);
        add(equal,BorderLayout.SOUTH);
        add(panelBotonesNumeros,BorderLayout.CENTER);

        setSize(300,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private JTextField getDisplay(){
        return display;
    }

    public void mostrarMensajeError(){
        new Temporizador(getDisplay());
    }

    public void sendToDisplay(String msg){
        getDisplay().setText(msg);
    }

    @Override
    public void setControlador(Controlador controlador) {
        panelBotonesNumeros.setControlador(controlador);
        equal.addActionListener(controlador);
    }
}
