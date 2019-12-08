package PatronesCreacionales.SimpleFactory;

/*
* Crear objetos complejos de una forma sencilla*/

public class Main {

    public static void main(String[] args) {

        Pizzeria pizzeria = new Pizzeria();

        Pizza pizzaPeperoni = pizzeria.crearPizzaChica();

    }


}
