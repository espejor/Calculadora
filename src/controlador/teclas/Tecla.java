package controlador.teclas;

import controlador.Controlador;
import controlador.estados.Estado;
import modelo.Expresion;
import modelo.IModelo;


public abstract class Tecla {
    protected String value;
    protected IModelo modelo;

    public Tecla(IModelo modelo,String value) {
        this.modelo = modelo;
        this.value = value;
    }

    /**
     * Getter de value
     * @return value
     */
    public String getValue() {
        return value;
    }


    public  void execWithStateLeyendoParteDecimal1(){ teclaIncorrecta();}
    public  void execWithStateLeyendoParteEntera1(){ teclaIncorrecta();}
    public  void execWithStateLeyendoParteDecimal2(){ teclaIncorrecta();}
    public  void execWithStateLeyendoParteEntera2(){ teclaIncorrecta();}
    public  void execWithStateMostrarResultado(){ teclaIncorrecta();}


    protected void sentToDisplay() {
        Controlador.sendToDisplay(getExpresion().toString());
    }


    protected Estado cambiarEstado(Estado nextState) {
        return Controlador.cambiarEstado(nextState);
    }

    private void teclaIncorrecta(){
        Controlador.sendErrorMsg();
    }


    protected void ejecutaOperacion() {
        Controlador.sendToDisplay(getExpresion().ejecutarOperacion().toString());

    }

    protected void resetOperando2() {
        modelo.resetOperando2();
    }

    protected void reset(){
        modelo.resetExpresion();
    }

    protected Expresion getExpresion(){
        return modelo.getExpresion();
    }


    protected void encolarOperando1(){
        modelo.encolarOperando1(this);
    }

    protected void encolarOperando2(){
        modelo.encolarOperando2(this);
    }
}
