package SOLID.InterfaceSegregation;

import SOLID.Liskov.IFelino;

public class Jaguar extends Animal implements IFelinoSalvaje {

    private int edad;
    private float peso;

    public Jaguar(int edad, float peso) {
        this.edad = edad;
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Jaguar{" +
                "edad=" + edad +
                ", peso=" + peso +
                '}';
    }

    public void comer(){
        System.out.println("El Jaguar come!");
    }
    @Override
    public void rugir() {
        System.out.println("El Jaguar ruge!");

    }

    @Override
    public void cazar() {
        System.out.println("El Jaguar caza!");

    }
}
