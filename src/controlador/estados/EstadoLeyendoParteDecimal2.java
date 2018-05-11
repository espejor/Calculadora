package controlador.estados;

import controlador.teclas.Tecla;
import modelo.Expresion;

public class EstadoLeyendoParteDecimal2 extends Estado {
    public EstadoLeyendoParteDecimal2(Tecla teclaPulsada, Expresion expresion) {
        super(teclaPulsada,expresion);
    }

    @Override
    public void exec() {
        this.teclaPulsada.execWithStateLeyendoParteDecimal2();
    }
}
