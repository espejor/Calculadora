package controlador.teclas;

import modelo.IModelo;


public class TeclaCambioSigno extends Tecla {

    public TeclaCambioSigno(IModelo modelo,String value) {
        super(modelo,value);
    }

    @Override
    public void execWithStateMostrarResultado() {
        cambiarSignoOperando1();
        sentToDisplay();
    }


    @Override
    public void execWithStateLeyendoParteDecimal1() {
        cambiarSignoOperando1();
        sentToDisplay();
    }

    @Override
    public void execWithStateLeyendoParteEntera1() {
        cambiarSignoOperando1();
        sentToDisplay();
    }

    @Override
    public void execWithStateLeyendoParteDecimal2() {
        cambiarSignoOperando2();
        sentToDisplay();
    }

    @Override
    public void execWithStateLeyendoParteEntera2() {
        cambiarSignoOperando2();
        sentToDisplay();
    }

    private void cambiarSignoOperando1(){
        modelo.cambiarSignoOperando1();
    }

    private void cambiarSignoOperando2() {
        modelo.cambiarSignoOperando2();
    }

}
