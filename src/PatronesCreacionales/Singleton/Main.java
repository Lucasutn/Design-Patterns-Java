package PatronesCreacionales.Singleton;

/*Ensure a class only has one instance, and provide a global point of access to it*/

public class Main {

    public static void main(String[] args) {

//        ConexionDB conexion = ConexionDB.obtenerConexion();
//        ConexionDB conexion1 = ConexionDB.obtenerConexion();
//        ConexionDB conexion2 = ConexionDB.obtenerConexion();
//
//        System.out.println(conexion.hashCode());
//        System.out.println(conexion1.hashCode());
//        System.out.println(conexion2.hashCode());

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {

                ConexionDB conexion = ConexionDB.obtenerConexion();
                System.out.println(conexion.hashCode());
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {

                ConexionDB conexion = ConexionDB.obtenerConexion();
                System.out.println(conexion.hashCode());
            }
        });

        t1.start();
        t2.start();

    }

}
