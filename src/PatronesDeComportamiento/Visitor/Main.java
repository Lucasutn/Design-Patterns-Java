package PatronesDeComportamiento.Visitor;

/*Visistor
*
* Represent an operation to be performed on the elements of an objects structure.
 *Visitor lets you define a new operation without changing the classes of the elements on which it operates*/

public class Main {

    public static void main(String[] args) {

        //fruta 10% desc
        //LineaBlanca 5% desc

        Manzana manzana = new Manzana();

        Lavadora lavadora = new Lavadora();

        IVisitor descuento = new DescuentoComun();

        System.out.println(manzana.aplicarDescuento(descuento));
        System.out.println(lavadora.aplicarDescuento(descuento));


    }

}
