package PatronesDeComportamiento.Memento;

/*Memento
*
* Without violating encapsulation, capture and externalize an object's internal state so that the object can be restored
* to this state later*/

public class Main {


    public static void main(String[] args) {

        Usuario usuario = new Usuario("Lucas",29);

        Usuario memento = usuario.getMemento();

        usuario.setNombre("Cambio de Nombre");
        usuario.setEdad(24);



        System.out.println(usuario.getNombre());
        System.out.println(usuario.getEdad());


        usuario.restartMemento(memento);

        System.out.println(usuario.getNombre());
        System.out.println(usuario.getEdad());




    }

}
