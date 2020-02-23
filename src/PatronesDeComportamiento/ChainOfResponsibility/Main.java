package PatronesDeComportamiento.ChainOfResponsibility;

/*Chain of Responsibility
*
* Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request.
* Chain the receiving objects and pass the request along the chain until an object handles it.*/

/*Si genero 100 objetos y los encadenos, puedo estar generando objetos de forma innecesaria
* lo recomendable es utilizar conjuntamente con el patro virtual proxy*/

public class Main {

    public static void main(String[] args) {

        Transaccion transaccion = new Transaccion(100,200,TipoTransaccion.Deposito);

        IManejadorTransacciones deposito = new Deposito();
        IManejadorTransacciones retiro = new Retiro();
        IManejadorTransacciones reembolso = new Reembolso();

        deposito.setNextManejador(retiro);
        retiro.setNextManejador(reembolso);

        deposito.ejecutarTransaccion(transaccion);


    }

}
