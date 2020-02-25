package PatronesDeComportamiento.Visitor;

public class DescuentoComun implements IVisitor {


    @Override
    public float descuento(IFruta fruta) {
        return fruta.getPrecio() * 0.10f;
    }

    @Override
    public float descuento(ILineaBlanca lineaBlanca) {
        return lineaBlanca.getPrecio() * 0.05f;
    }

}
