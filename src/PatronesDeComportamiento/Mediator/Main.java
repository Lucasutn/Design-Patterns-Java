package PatronesDeComportamiento.Mediator;

/*Meadiator
* Define an object that encapsulates how a set of objects interact.
* Mediator promotes loose coupling by keeping objects from referring to each other
* explicitly, and it lets you vary their interaction independently*/


public class Main {

    public static void main(String[] args) {

        Usuario lucas = new Usuario("Lucas");
        Usuario hernan = new Usuario("Hernan");

        SalaChat sala = new SalaChat();

        sala.addParticipante(lucas);
        sala.addParticipante(hernan);

        sala.enviarMensaje(lucas,hernan, "Holaaa!");

    }

}
