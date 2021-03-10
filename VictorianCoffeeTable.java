package kz.aitu.oop.assignment6;

public class VictorianCoffeeTable implements CoffeeTable{

    @Override
    public void description() {
        System.out.println("This is victorian coffee table.");
    }

    @Override
    public void showMaterial() {
        System.out.println("Material of victorian coffee table is oak.");
    }
}
