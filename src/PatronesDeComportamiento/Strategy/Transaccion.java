package PatronesDeComportamiento.Strategy;

public class Transaccion {

    private IEstrategia estrategia;

    public Transaccion(IEstrategia estrategia) {

        this.estrategia = estrategia;

    }

    public float ejecutarTrasaccion(float balance, float cantidad) {

        return this.estrategia.realizarOperacion(balance,cantidad);

    }
}
