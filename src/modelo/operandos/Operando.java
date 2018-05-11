package modelo.operandos;

import controlador.teclas.Tecla;

public class Operando {
    private String valueStr = "";
    private Double valueNumber;
    private boolean negativo = false;

    public Operando() {
    }

    public Operando(Operando operando){
        valueStr = operando.valueStr;
        valueNumber = operando.valueNumber;
        negativo = operando.negativo;
    }

    public Operando(Double valor) {
        valueStr = valor.toString();
        if (valor < 0)
            negativo = true;
    }



    private double createValue(){
        if (!valueStr.equals("") && !valueStr.equals("-"))
            valueNumber = Double.valueOf(valueStr);
        else
            valueNumber = 0.0;
        return valueNumber;
    }

    /**
     * Getter de valueNumber
     * @return valueNumber
     */
    public Double getValueNumber() {
        return createValue();
    }

    public void cambiarSigno(){
        negativo = !negativo;
        if (negativo)
            valueStr = "-" + valueStr;
        else
            setValorAbsoluto();
//        createValue();
    }

    private void setValorAbsoluto(){
        if (valueStr.charAt(0) == '-')
            valueStr = valueStr.substring(1);
    }

    public void encola(Tecla pulsacion){
        String value = pulsacion.getValue();
        if (valueStr.equals("") && value.equals("."))
            valueStr = "0";
        valueStr += value;
    }


    @Override
    public String toString() {
        return valueStr;
    }
}
