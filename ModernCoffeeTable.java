package kz.aitu.oop.assignment6;

public class ModernCoffeeTable implements CoffeeTable{

    @Override
    public void description() {
        System.out.println("This is modern coffee table.");
    }

    @Override
    public void showMaterial() {
        System.out.println("Material of modern sofa is wood.");
    }
}
