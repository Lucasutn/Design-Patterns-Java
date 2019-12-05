package PatronesCreacionales.FactoryMethod;

/*Factory Method */
/*Define an interface for creating an object, but let subclasses decide which class
* to instantiate.Factory Method lets a class defer instantiation to subclasses*/
public class Main {

    public static void main(String[] args) {


        PizzeriaCF cf = new PizzeriaCF();
        Pizza peperoni = cf.crearPizzeria("Peperoni");
        Pizza hawaiana = cf.crearPizzeria("Hawaiana");
        Pizza orillaRellena = cf.crearPizzeria("Peperoni orilla rellena");

        System.out.println(peperoni);
        System.out.println(hawaiana);
        System.out.println(orillaRellena);

    }

}
