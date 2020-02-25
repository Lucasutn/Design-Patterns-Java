package PatronesDeComportamiento.TemplateMethod;

public class Main {

    /*Template Method
    * Define the skeleton of an algorithm in an operation, deferring some steps to subclasses.
     *Template Method lets subclasses redefine certain steps of an algorithm without
     * changing the algorithm's structure.*/

    public static void main(String[] args) {

        Usuario gerente = new Gerente();
        Usuario administrador = new Administrador();

        gerente.autenticacion();
        gerente.formaTrabajar();

        administrador.autenticacion();
        administrador.formaTrabajar();



    }


}
