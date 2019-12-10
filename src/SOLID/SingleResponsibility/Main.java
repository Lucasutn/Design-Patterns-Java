package SOLID.SingleResponsibility;

/*Single Responsibility
* A class should have one and only one reason to change,
* meaning that a class should have only one job*/

/*Cohesion
La Cohesion es una medida de cuanto una unidad tiene relacion con sigo mismas.*/




public class Main {

    public static void main(String[] args) {


        Rectangulo rectangulo = new Rectangulo(10,20);
        Presentacion presentacion = new Presentacion();

        presentacion.imprimir(rectangulo);
    }

}
