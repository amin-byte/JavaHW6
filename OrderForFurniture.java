package kz.aitu.oop.assignment6;

public class OrderForFurniture {
    public static void main(String[] args) {
        FurnitureFactory furniture = new VictorianFurnitureFactory();
        Chair chair = furniture.getChair();
        Sofa sofa = furniture.getSofa();
        CoffeeTable coffeeTable = furniture.getCoffeeTable();

        System.out.println("You ordered chair.");
        chair.description();
        chair.hasLegs();
        chair.sitOn();
        System.out.println("");

        System.out.println("You ordered sofa.");
        sofa.description();
        sofa.showQuality();
        System.out.println("");

        System.out.println("You ordered coffee table.");
        coffeeTable.description();
        coffeeTable.showMaterial();
    }
}
