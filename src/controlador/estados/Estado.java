package controlador.estados;

import controlador.teclas.Tecla;
import modelo.Expresion;

public abstract class Estado {
    protected Tecla teclaPulsada;
    private Expresion expresion;

    public Estado(Tecla teclaPulsada, Expresion expresion) {
        this.teclaPulsada = teclaPulsada;
        this.expresion = expresion;
    }

    public abstract void exec ();


    /**
     * Setter de teclaPulsada
     * @param teclaPulsada del tipo controlador.teclas.Tecla
     */
    public void setTeclaPulsada(Tecla teclaPulsada) {
        this.teclaPulsada = teclaPulsada;
    }

    public Expresion getExpresion() {
        return expresion;
    }
}
