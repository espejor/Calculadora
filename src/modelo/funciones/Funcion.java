package modelo.funciones;

import modelo.operandos.Operando;

public abstract class Funcion {
    private String funcion;

    public Funcion(String value) {
        this.funcion = value;
    }

    public abstract Operando execute(Operando op1, Operando op2);

    @Override
    public String toString() {
        return funcion;
    }
}
