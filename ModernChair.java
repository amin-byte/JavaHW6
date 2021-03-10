package kz.aitu.oop.assignment6;

public class ModernChair implements Chair{

    @Override
    public void description() {
        System.out.println("This is modern chair.");
    }

    @Override
    public void hasLegs() {
        System.out.println("Modern chair has 4 legs.");
    }

    @Override
    public void sitOn() {
        System.out.println("You are sitting on the modern chair.");
    }
}
