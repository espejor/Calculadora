package controlador.teclas;

import controlador.Controlador;
import controlador.estados.EstadoLeyendoParteDecimal1;
import controlador.estados.EstadoLeyendoParteDecimal2;
import modelo.IModelo;

import static controlador.Controlador.getState;

public class TeclaPunto extends Tecla {
    public TeclaPunto(IModelo modelo, String value) {
        super(modelo,value);
    }

    @Override
    public void execWithStateMostrarResultado() {
        reset();
        encolarOperando1();
        Controlador.cambiarEstado(new EstadoLeyendoParteDecimal1(this,getState().getExpresion()));
        sentToDisplay();
    }


    @Override
    public void execWithStateLeyendoParteEntera1() {
        encolarOperando1();
        Controlador.cambiarEstado(new EstadoLeyendoParteDecimal1(this,getState().getExpresion()));
        sentToDisplay();
    }


    @Override
    public void execWithStateLeyendoParteEntera2() {
        encolarOperando2();
        Controlador.cambiarEstado(new EstadoLeyendoParteDecimal2(this,getState().getExpresion()));
        sentToDisplay();
    }

}
