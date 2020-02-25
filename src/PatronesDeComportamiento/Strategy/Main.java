package PatronesDeComportamiento.Strategy;

/*Strategy
*
* Define a family of algorithms, encapsulate each one, and make them interchangeable.
* Strategy lets the algorithm vary independently from clients that use it.*/

public class Main {

    public static void main(String[] args) {

        Transaccion transaccion1 = new Transaccion(new Deposito());

        System.out.println(transaccion1.ejecutarTrasaccion(100,20));

        Transaccion transaccion2 = new Transaccion(new Retiro());

        System.out.println(transaccion2.ejecutarTrasaccion(100,20));


    }

}
