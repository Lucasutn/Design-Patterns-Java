package PatronesEstructurales.Proxy;

/*Proxxy
*
* Provide a surrogate or placeholder for another object to control access to it*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Usuario usuario = new Usuario(3);

        //IServicio servicio = new Servicio();

        IServicio servicio = new ProxyServicio(new Servicio(),usuario);

        servicio.leer();
        servicio.escribir();
        servicio.actualizar();
        servicio.eliminar();

    }


}
