package PatronesDeComportamiento.Observer;

import java.util.LinkedHashSet;
import java.util.Set;

public class Producto implements IObservable{


    private Set<IObserver> observadores;
    private int stock;


    public Producto(int stock) {
        this.stock = stock;
        this.observadores =  new LinkedHashSet<>();
    }

    public void venta(){

        this.setStocck(this.stock - 1);
        System.out.println("Producto vendido!");

        this.notificarObservadores();

    }


    public int getStocck() {
        return stock;
    }

    public void setStocck(int stocck) {
        this.stock = stocck;
    }

    @Override
    public void addObserver(IObserver o) {

        this.observadores.add(o);

    }

    @Override
    public void notificarObservadores() {

        for (IObserver observador : this.observadores) {

            observador.notificacion("El producto se vendio");

        }
    }

    @Override
    public void removeObserver() {

    }

}
