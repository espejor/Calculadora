package modelo;

import controlador.teclas.Tecla;
import modelo.funciones.Funcion;

public interface IModelo {
    void setFuncion(Funcion funcion);
    void cambiarSignoOperando1();
    void cambiarSignoOperando2();
    void encolarOperando1(Tecla tecla);
    void encolarOperando2(Tecla tecla);
    void resetExpresion();
    void resetOperando2();
    Expresion getExpresion();
}
