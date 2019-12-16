package SOLID.Liskov;

/*Sustitucion Liskov
*
* Let q(x) be a property provable about objects of x of type T.Then q(y) should be provable
* for objects y of type S where S is a subtype of T.
*
* //Jaguar subtipo de Felino
* Jaguar jaguar = new Jaguar()
* Felino jaguar = new Jaguar()
*
* Es posible utilizar una clase padre y aun asi poder ejecutar todos los metodos de una clase padre
*
* El subtipo deberia poder heredar y utilizar todos los metodos de la clase padre*/

public class Main {

    public static void main(String[] args) {

    IFelino jaguar =  new Jaguar(10,120f);

    //jaguar no maulla -> solucion en Interface Segregation
    jaguar.maullar();

    }


}
