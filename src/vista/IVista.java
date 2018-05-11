package vista;

import controlador.Controlador;

public interface IVista {
    void mostrarMensajeError();
    void sendToDisplay(String msg);

    void setVisible(boolean b);

    void setControlador(Controlador controlador);
}
