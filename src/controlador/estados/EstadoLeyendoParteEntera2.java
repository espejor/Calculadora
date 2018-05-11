package controlador.estados;

import controlador.teclas.Tecla;
import modelo.Expresion;
import modelo.operandos.Operando;

public class EstadoLeyendoParteEntera2 extends Estado {
    public EstadoLeyendoParteEntera2(Tecla teclaPulsada, Expresion expresion) {
        super(teclaPulsada,expresion);
        expresion.setOperando2(new Operando());
    }

    @Override
    public void exec() {
        this.teclaPulsada.execWithStateLeyendoParteEntera2();
    }
}
