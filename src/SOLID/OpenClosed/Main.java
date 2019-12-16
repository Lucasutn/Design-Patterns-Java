package SOLID.OpenClosed;

/*Open/Closed
* Objects or entities should be open for extension, but closed for modification*/


public class Main {


    public static void main(String[] args) {

    Rectangulo rectangulo = new Rectangulo(10,20);
    Triangulo triangulo = new Triangulo(10,5);


    Presentacion presentacion = new Presentacion();

    presentacion.area(rectangulo);
    presentacion.area(triangulo);
    }



}
