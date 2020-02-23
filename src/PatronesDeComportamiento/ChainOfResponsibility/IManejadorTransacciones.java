package PatronesDeComportamiento.ChainOfResponsibility;

public interface IManejadorTransacciones {

    void  setNextManejador(IManejadorTransacciones next);

    void  ejecutarTransaccion(Transaccion transaccion); // es recomendable aplicar un interface de tipo Transaccion

}