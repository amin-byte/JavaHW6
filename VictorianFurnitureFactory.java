package kz.aitu.oop.assignment6;

public class VictorianFurnitureFactory implements FurnitureFactory{

    @Override
    public Chair getChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa getSofa() {
        return new VictorianSofa();
    }

    @Override
    public CoffeeTable getCoffeeTable() {
        return new VictorianCoffeeTable();
    }
}
