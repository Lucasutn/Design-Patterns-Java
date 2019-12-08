package PatronesCreacionales.Builder;

//Soluciona problematica de tener demasiados constructores para cada caso especifico

/*Separate the construction of a complex object from its representation so that the same construction process
* can create different representations*/



public class Main {

    public static void main(String[] args) {


        Usuario lucas = Usuario.Make("Lucas","Frias")
                                .setEmail("lucas@lucas.com")
                                .setTelefono("545789987")
                                .setDireccion("Argentina")
                                .Build();



        System.out.println(lucas);
    }


}
