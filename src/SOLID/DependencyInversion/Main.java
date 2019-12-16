package SOLID.DependencyInversion;

/*
* Dependency Inversion
*
* Entities must depend on abstraction not on concretions. It states
* that the high level module must not depend on the low level module,
 * but they should depend on abstractions*/



public class Main {

    public static void main(String[] args) {


        Teclado teclado = new Teclado();
        Mouse mouse = new Mouse();

    Computadora computadora = new Computadora(teclado,mouse);
    computadora.encender();

    }


}
