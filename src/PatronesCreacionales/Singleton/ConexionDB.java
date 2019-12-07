package PatronesCreacionales.Singleton;

/*Siempre retornara el mis objeto por que conexion es una variable static, esto es un miembre de la clase y no asi de los
* objetos que se crean*/

public class ConexionDB {

    private static ConexionDB conexion;
    public String host;


    private ConexionDB() {

    }


    public synchronized static ConexionDB obtenerConexion() {

        if (conexion == null) {

            conexion=new ConexionDB();

        }
        return conexion ;

    }


}
