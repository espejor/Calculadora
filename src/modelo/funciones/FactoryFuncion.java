package modelo.funciones;

public class FactoryFuncion {
    public static Funcion getFuncion(String tecla){
        if (tecla.equals("+")) return new FuncionMas("+");
        if (tecla.equals("-")) return new FuncionMenos("-");
        if (tecla.equals("*")) return new FuncionPor("*");
        if (tecla.equals("/")) return new FuncionDiv("/");
        return new FuncionNula("");
    }
}
