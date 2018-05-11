package modelo.funciones;

import modelo.operandos.Operando;
import modelo.operandos.OperandoNull;

public class FuncionNula extends Funcion {
    FuncionNula(String value) {
        super(value);
    }

    public FuncionNula() {
        super("");
    }

    @Override
    public Operando execute(Operando op1, Operando op2) {
        return new OperandoNull();
    }

}
