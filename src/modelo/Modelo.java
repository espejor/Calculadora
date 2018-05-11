package modelo;

import controlador.teclas.Tecla;
import modelo.funciones.Funcion;

public class Modelo implements IModelo{
    private static Expresion expresion;
    //private Tecla teclaPulsada;

    // Instancia de la misma clase Modelo
    private static Modelo ourInstance = new Modelo();

    // Único punto de creación de una instancia de Modelo
    public static Modelo getInstance() {
        return ourInstance;
    }

    // Constructor privado de Modelo
    private Modelo() {
        expresion = new Expresion();
    }

    /**
     * Getter de expresion
     * @return expresion
     */
    public Expresion getExpresion() {
        return expresion;
    }


    @Override
    public void setFuncion(Funcion funcion) {
        expresion.setFuncion(funcion);
    }

    @Override
    public void cambiarSignoOperando1() {
        expresion.getOperando1().cambiarSigno();
    }

    @Override
    public void cambiarSignoOperando2() {
        expresion.getOperando2().cambiarSigno();
    }

    @Override
    public void encolarOperando1(Tecla tecla) {
        expresion.getOperando1().encola(tecla);
    }

    @Override
    public void encolarOperando2(Tecla tecla) {
        expresion.getOperando2().encola(tecla);
    }


    @Override
    public void resetExpresion() {
        expresion.reset();
    }

    @Override
    public void resetOperando2() {
        expresion.resetOperando2();
    }


}
