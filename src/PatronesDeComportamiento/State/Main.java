package PatronesDeComportamiento.State;

/*State
*
* Allow an object to alter its behavior when its internal state changes.
* The object will appear to change its class.*/

public class Main {

    public static void main(String[] args) {

    Auto auto = new Auto();

    auto.encender();
    auto.apagar();
    auto.manejar();


    }

}
