package controlador;

import controlador.estados.Estado;
import controlador.estados.EstadoLeyendoParteEntera1;
import controlador.teclas.FactoryTeclas;
import controlador.teclas.TeclaNumero;
import modelo.Expresion;
import modelo.IModelo;
import vista.IVista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {
    private static IVista vista;
    private static IModelo modelo;
    private static Estado estado;

    public Controlador(IVista vista,IModelo modelo) {
        Controlador.vista = vista;
        Controlador.modelo = modelo;
        estado = new EstadoLeyendoParteEntera1(new TeclaNumero(modelo,"0.0"), getExpresion());
        sendToDisplay("0.0");
        vista.setControlador(this);
    }

    /**
     * Invoked when an action occurs.
     * @param e Evento
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        estado.setTeclaPulsada(FactoryTeclas.getTecla(modelo, e.getActionCommand()));
        estado.exec();
    }

    /**
     * Getter de state
     * @return state
     */
    public static Estado getState() {
        return estado;
    }

    /**
     * Setter de nuevoEstado
     * @param nuevoEstado del tipo controlador.estados.Estado
     */
    public static Estado cambiarEstado(Estado nuevoEstado) {
        return Controlador.estado = nuevoEstado;
    }

    public static void sendToDisplay(String s){
        vista.sendToDisplay(s);
    }

    public static void sendErrorMsg() {
        vista.mostrarMensajeError();
    }

    private Expresion getExpresion(){
        return modelo.getExpresion();
    }

}
