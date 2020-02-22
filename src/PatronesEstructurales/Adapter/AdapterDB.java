package PatronesEstructurales.Adapter;

public class AdapterDB implements IConexionSQL{

    private IConexionNOSQL noSQL;

    public AdapterDB(IConexionNOSQL noSQL) {
        this.noSQL = noSQL;
    }

    @Override
    public void conexion() {

        this.noSQL.conexion();

    }

    @Override
    public String runQuery() {
        return this.noSQL.excecuteSentence();
    }

}
