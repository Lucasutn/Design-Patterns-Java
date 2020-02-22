package PatronesEstructurales.Facade;

public class Mouse implements IMouse {

    @Override
    public void conectar() {

        System.out.println("Conexion Mouse via USB!");
    }

}
