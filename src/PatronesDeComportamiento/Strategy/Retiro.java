package PatronesDeComportamiento.Strategy;

public class Retiro implements IEstrategia{

    @Override
    public float realizarOperacion(float balance, float cantidad) {
        return balance - cantidad;
    }

}
