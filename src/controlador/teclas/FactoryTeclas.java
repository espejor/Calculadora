package controlador.teclas;

import modelo.IModelo;

public class FactoryTeclas {
    public static Tecla getTecla(IModelo modelo, String teclaPulsada){
        if (teclaPulsada.equals("."))
            return new TeclaPunto(modelo,teclaPulsada);
        else if (teclaPulsada.equals("="))
            return new TeclaIgual(modelo,teclaPulsada);
        else if (isNumeric(teclaPulsada))
            return new TeclaNumero(modelo,teclaPulsada);
        else if (teclaPulsada.equals("+/-"))
            return new TeclaCambioSigno(modelo,teclaPulsada);
        else
            return new TeclaFuncion(modelo,teclaPulsada);
    }
    private static boolean isNumeric(String teclaPulsada){
        return Character.isDigit(teclaPulsada.charAt(0));
    }
}
