package controlador.estados;

import controlador.teclas.Tecla;
import modelo.Expresion;

public class EstadoLeyendoParteDecimal1 extends Estado{
    public EstadoLeyendoParteDecimal1(Tecla teclaPulsada, Expresion expresion) {
        super(teclaPulsada,expresion);
    }

    @Override
    public void exec() {
        this.teclaPulsada.execWithStateLeyendoParteDecimal1();
    }
}
