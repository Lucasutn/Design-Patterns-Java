package PatronesEstructurales.Facade;

public class Teclado implements ITeclado {

    @Override
    public void conectar() {

        System.out.println("Conexion Teclado via USB!");

    }
}
