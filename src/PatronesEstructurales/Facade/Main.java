package PatronesEstructurales.Facade;

/*
* Facade
* Provide a unified interface to a set of interfaces in a subsystem.
* Facade defines a higher-level interface that makes the subsystem easier to use.
 */

public class Main {


    public static void main(String[] args) {

        Fachada fachadaComputadora = new Fachada();

        fachadaComputadora.encender();

    }
}
