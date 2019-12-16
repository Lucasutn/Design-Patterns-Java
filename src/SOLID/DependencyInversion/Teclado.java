package SOLID.DependencyInversion;

public class Teclado implements  ITeclado{

    public void conectar(){

        System.out.println("Conexion Teclado via USB");
    }
}
