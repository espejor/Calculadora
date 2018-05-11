package modelo.funciones;

import modelo.operandos.Operando;

public class FuncionMas extends Funcion {
    FuncionMas(String value) {
        super(value);
    }

    @Override
    public Operando execute(Operando op1, Operando op2) {
        return new Operando(op1.getValueNumber() + op2.getValueNumber());
    }
}
