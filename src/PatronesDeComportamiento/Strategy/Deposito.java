package PatronesDeComportamiento.Strategy;

public class Deposito implements IEstrategia{

    @Override
    public float realizarOperacion(float balance, float cantidad) {
        return balance + cantidad;
    }

}
