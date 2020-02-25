package PatronesDeComportamiento.Visitor;

public interface IVisitor {

    float descuento(IFruta fruta);

    float descuento(ILineaBlanca lineaBlanca);

}
