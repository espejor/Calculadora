package controlador.estados;

import controlador.teclas.Tecla;
import modelo.Expresion;

public class EstadoMostrarResultado extends Estado {
    public EstadoMostrarResultado(Tecla teclaPulsada, Expresion expresion) {
        super(teclaPulsada, expresion);
    }

    @Override
    public void exec() {
        teclaPulsada.execWithStateMostrarResultado();
    }
}
