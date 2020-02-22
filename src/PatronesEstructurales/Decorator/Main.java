package PatronesEstructurales.Decorator;

/*

Decorator

Attach additional responsibilities to an object dynamically.
Decorators provide a flexible alternative to subclassing for extending functionality.

*/

public class Main {

    public static void main(String[] args) {

       // IPizza pizzaPeperoni = new PizzaPeperoni();

        IPizza pizzaPeperoni = new QuesoExtra(new PizzaPeperoni());



        System.out.println(pizzaPeperoni.descripcion());
        System.out.println(pizzaPeperoni.precio());


       // IPizza pizzaHawaiana = new PizzaHawaiana();

        IPizza pizzaHawaiana = new QuesoExtra(new OrillaRellena(new PizzaHawaiana()));


        System.out.println(pizzaHawaiana.descripcion());
        System.out.println(pizzaHawaiana.precio());

        //Quese extra 2
        //Orilla rellena 4

    }


}
