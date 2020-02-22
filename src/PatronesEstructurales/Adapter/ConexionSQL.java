package PatronesEstructurales.Adapter;

public class ConexionSQL implements IConexionSQL {

    @Override
    public void conexion() {
        System.out.println("Conexion con MYSQL");
    }

    @Override
    public String runQuery() {
        return "Consulta MYSQL";
    }
}
