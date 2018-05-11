package controlador.teclas;

import controlador.estados.EstadoLeyendoParteEntera1;
import modelo.IModelo;

public class TeclaNumero extends Tecla {
    public TeclaNumero(IModelo modelo, String value) {
        super(modelo,value);
    }

    @Override
    public void execWithStateMostrarResultado() {
        reset();
        cambiarEstado(new EstadoLeyendoParteEntera1(this,getExpresion())).exec();
    }


    @Override
    public void execWithStateLeyendoParteEntera1() {
        encolarOperando1();
        sentToDisplay();
    }

    @Override
    public void execWithStateLeyendoParteDecimal1() {
        encolarOperando1();
        sentToDisplay();
    }

    @Override
    public void execWithStateLeyendoParteDecimal2() {
        encolarOperando2();
        sentToDisplay();
    }

    @Override
    public void execWithStateLeyendoParteEntera2() {
        encolarOperando2();
        sentToDisplay();
    }

}
