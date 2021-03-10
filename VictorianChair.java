package kz.aitu.oop.assignment6;

public class VictorianChair implements Chair{

    @Override
    public void description() {
        System.out.println("This is victorian chair.");
    }

    @Override
    public void hasLegs() {
        System.out.println("Victorian chair has 4 legs");;
    }

    @Override
    public void sitOn() {
        System.out.println("You are sitting on the victorian chair.");;
    }
}
