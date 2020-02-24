package PatronesDeComportamiento.Command;

/*Command
* Encapsulate a request as an object, thereby letting you parametererize clients with different requests,
* queue or log requests, and support undoable operations*/

/*nos permitira testear de una mejor manera nuestra aplicacion, de tal forma de saber puntualmente si un metodo
 se ejecuto corretamente o fallo, podemos revertir el cambio hecho por el metodo en concreto*/

public class Main {


    public static void main(String[] args) {


        IDevise tv = new TV();

        ICommand on = new OnDevise(tv);
        ICommand off = new OffDevise(tv);

        on.operacion();
        off.operacion();


    }


}
