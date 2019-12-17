package PatronesCreacionales.Prototype;

/*Prototype
 *
 * Specify the kinds of objects to create using a prototypical instance,
 * and create new objects by copying this prototype.*/

/*cuando los atributos sean costosos de obtener es conveniente utilizar prototype
consumo de api
consulta de una base de datos
lectura de un archivo

nos permite generar n cantidad de nuevos objetos apartir de un prototipo (enemigoBase) apartir de un objeto base,
los nuevos objetos seran ligeramente diferente del objeto base */

public class Main {


    public static void main(String[] args) {

        Enemigo enemigoBase = new Enemigo("Imagen1.png", 0, 100, 2);

        Enemigo enemigo1 = new Enemigo(enemigoBase);
        Enemigo enemigo2 = new Enemigo(enemigoBase);
        Enemigo enemigo3 = new Enemigo(enemigoBase);

        enemigo1.setPosX(100);
        enemigo2.setPosX(150);
        enemigo3.setPosX(200);


        Enemigo enemigoBase2 = new Enemigo("Imagen1.png", 0, 200, 2);


        Enemigo enemigo4 = enemigoBase2.clone();
        Enemigo enemigo5 = enemigoBase2.clone();
        Enemigo enemigo6 = enemigoBase2.clone();

        enemigo4.setPosX(200);
        enemigo5.setPosX(250);
        enemigo6.setPosX(300);


    }


}
