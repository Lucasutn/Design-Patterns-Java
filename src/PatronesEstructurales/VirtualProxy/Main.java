package PatronesEstructurales.VirtualProxy;

/*VirtualProxy
*es una variante de proxy
*
* virtual proxy no restringe el acceso a al objeto real, sino que intenta retrasar su creacion,
* esto nos es util cuando estamos por crear un objeto de muy alto costo computacional(como una consulta a una base de datos, o API)
*
*
* */

public class Main {

    public static void main(String[] args) {

        Usuario usuario = new Usuario(3);

        //IServicio servicio = new Servicio();

        IServicio servicio = new ProxyServicio(usuario);

        servicio.leer();
        servicio.escribir();
        servicio.actualizar();
        servicio.eliminar();


        //si el cliente no ejecuta ninguno de estos metodos el objeto no sera creado hasta que no sea necesario.(se lo requiera)

    }


}
