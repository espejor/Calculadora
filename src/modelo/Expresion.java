package modelo;

import modelo.funciones.Funcion;
import modelo.funciones.FuncionNula;
import modelo.operandos.Operando;
import modelo.operandos.OperandoNull;

public class Expresion {
    private Operando operando1;
    private Operando operando2;
    private Operando resultado;

    private Funcion funcion;

    public Expresion() {
        operando1 = new OperandoNull();
        operando2 = new OperandoNull();
        resultado = new OperandoNull();
        funcion = new FuncionNula();
    }

    /**
     * Getter de operando1
     * @return operando1
     */
    public Operando getOperando1() {
        return operando1;
    }

    /**
     * Setter de operando1
     * @param operando1 del tipo modelo.funciones.Funcion
     */
    public void setOperando1(Operando operando1) {
        this.operando1 = operando1;
    }

    /**
     * Getter de operando2
     * @return operando2
     */
    public Operando getOperando2() {
        return operando2;
    }

    /**
     * Setter de operando2
     * @param operando2 del tipo modelo.funciones.Funcion
     */
    public void setOperando2(Operando operando2) {
        this.operando2 = operando2;
    }


    /**
     * Setter de funcion
     * @param funcion del tipo modelo.operandos.Operando
     */
    public void setFuncion(Funcion funcion) {
        this.funcion = funcion;
    }

    @Override
    public String toString() {
        return operando1 + " " + funcion + " " + operando2;
    }

    public void resetOperando2() {
        operando2 = new OperandoNull();
        funcion = new FuncionNula();
    }

    public Operando ejecutarOperacion() {
        resultado = funcion.execute(getOperando1(),getOperando2());
        operando1 = resultado;
        return resultado;
    }

    public void reset() {
        operando1 = new OperandoNull();
        operando2 = new OperandoNull();
        funcion = new FuncionNula();
    }
}
