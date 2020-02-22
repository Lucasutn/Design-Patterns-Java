package PatronesEstructurales.Adapter;

public class ConexionMongoDB implements IConexionNOSQL {

    @Override
    public void conexion() {
        System.out.println("Conexion con MongoDB");
    }

    @Override
    public String excecuteSentence() {
        return "Consulta MongoDB";
    }

}
