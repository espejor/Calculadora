package controlador.estados;

import controlador.teclas.Tecla;
import modelo.Expresion;
import modelo.operandos.Operando;

public class EstadoLeyendoParteEntera1 extends Estado {
    public EstadoLeyendoParteEntera1(Tecla teclaPulsada, Expresion expresion) {
        super(teclaPulsada,expresion);
        expresion.setOperando1(new Operando());
    }

    @Override
    public void exec() {
        this.teclaPulsada.execWithStateLeyendoParteEntera1();
    }
}
