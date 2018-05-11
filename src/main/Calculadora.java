package main;

import controlador.Controlador;
import modelo.IModelo;
import modelo.Modelo;
import vista.IVista;
import vista.Vista;

public class Calculadora  {
    public static void main(String[] args) {
        IVista vista = Vista.getInstance();
        IModelo modelo = Modelo.getInstance();
        new Controlador(vista,modelo);

        vista.setVisible(true);
    }
}


