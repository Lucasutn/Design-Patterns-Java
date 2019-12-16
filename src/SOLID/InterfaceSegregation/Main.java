package SOLID.InterfaceSegregation;

/*Interface Segregation
*
* A client should never be forced to implement an interface that it doesn't use or
* clients shouldn't be forced to depend on methods they do not use.*/

public class Main {

    public static void main(String[] args) {

    IFelino jaguar =  new Jaguar(10,120f);

    jaguar.cazar();

    /*Con esto se implementa tambien el principio de Liskov
      El cual dice que deberiamos poder utilizar todos los metrodos de una clase padre  */

    //jaguar.maullar();


    }

}
