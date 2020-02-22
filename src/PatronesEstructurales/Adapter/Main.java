package PatronesEstructurales.Adapter;

/*AdapterDB
*
* Convert the interface of a class into another interface clients expect.
* AdapterDB lets classes work together that couldn't otherwise because of incompatible interfaces.*/

public class Main {

    public static void main(String[] args) {



        //IConexionSQL conexion = new ConexionSQL();
        IConexionSQL conexion = new AdapterDB(new ConexionMongoDB());//adapter

        conexion.conexion();

        String resultado = conexion.runQuery();
        System.out.println(resultado);


    }

}
