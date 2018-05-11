package controlador.teclas;

import controlador.estados.EstadoMostrarResultado;
import modelo.IModelo;

public class TeclaIgual extends Tecla {
    public TeclaIgual(IModelo modelo,String value) {
        super(modelo,value);
    }


    @Override
    public void execWithStateLeyendoParteDecimal2() {
        ejecutaOperacion();
        resetOperando2();
        cambiarEstado(new EstadoMostrarResultado(this,getExpresion()));
    }

    @Override
    public void execWithStateLeyendoParteEntera2() {
        ejecutaOperacion();
        resetOperando2();
        cambiarEstado(new EstadoMostrarResultado(this,getExpresion()));
    }

}
