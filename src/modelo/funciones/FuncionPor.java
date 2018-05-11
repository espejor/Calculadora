package modelo.funciones;

import modelo.operandos.Operando;

public class FuncionPor extends Funcion {
    FuncionPor(String value) {
        super(value);
    }

    @Override
    public Operando execute(Operando op1, Operando op2) {
        return new Operando(op1.getValueNumber() * op2.getValueNumber());
    }
}
