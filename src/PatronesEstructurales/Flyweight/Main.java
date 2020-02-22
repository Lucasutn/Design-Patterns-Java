package PatronesEstructurales.Flyweight;

/*
 * Flyweight
 *
 * Use sharing to support large numbers of fine-grained objects efficiently*/

public class Main {

    public static void main(String[] args) {

        NubeFactory factory = new NubeFactory();


        for (int i = 0; i < 100; i++) {

            Nube nube = factory.getNube(TipoNube.Chica);

        }

        for (int i = 0; i < 100; i++) {

            Nube nube = factory.getNube(TipoNube.Mediana);

        }

        for (int i = 0; i < 100; i++) {

            Nube nube = factory.getNube(TipoNube.Grande);

        }

        System.out.println(factory.countNubesMap());


    }

}
