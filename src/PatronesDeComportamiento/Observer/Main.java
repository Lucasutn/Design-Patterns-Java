package PatronesDeComportamiento.Observer;

/*Observer
 * Define a one-to-many dependency between objects so that when one object changes state,
 * all its dependents are notified and updated automatically*/

public class Main {

    public static void main(String[] args) {

        Producto aguacate = new Producto(10);

        Usuario usuario1 = new Usuario();
        Usuario usuario2 = new Usuario();
        Usuario usuario3 = new Usuario();

        aguacate.addObserver(usuario1);
        aguacate.addObserver(usuario2);

        aguacate.venta();

    }

}
