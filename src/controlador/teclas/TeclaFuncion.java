package controlador.teclas;

import controlador.estados.EstadoLeyendoParteEntera2;
import modelo.IModelo;
import modelo.funciones.FactoryFuncion;
import modelo.funciones.Funcion;

public class TeclaFuncion extends Tecla {
    Funcion funcion;

    public TeclaFuncion(IModelo modelo, String value) {
        super(modelo,value);
        funcion = FactoryFuncion.getFuncion(value);
    }



    @Override
    public void execWithStateLeyendoParteDecimal1() {
        setFuncion(funcion);
        cambiarEstado(new EstadoLeyendoParteEntera2(this,getExpresion()));
        sentToDisplay();
    }

    @Override
    public void execWithStateLeyendoParteEntera1() {
        setFuncion(funcion);
        cambiarEstado(new EstadoLeyendoParteEntera2(this,getExpresion()));
        sentToDisplay();
    }

    @Override
    public void execWithStateMostrarResultado() {
        setFuncion(funcion);
        cambiarEstado(new EstadoLeyendoParteEntera2(this,getExpresion()));
        sentToDisplay();
    }

    private void setFuncion(Funcion funcion){
        modelo.setFuncion(funcion);
    }


}
