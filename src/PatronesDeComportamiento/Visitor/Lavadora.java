package PatronesDeComportamiento.Visitor;

public class Lavadora implements ILineaBlanca, IVisitable{


    @Override
    public float getPrecio() {
        return 20f;
    }

    @Override
    public float aplicarDescuento(IVisitor visitor) {
        return visitor.descuento(this);
    }
}
