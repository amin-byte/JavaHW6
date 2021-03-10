package kz.aitu.oop.assignment6;

public class VictorianSofa implements Sofa{

    @Override
    public void description() {
        System.out.println("This is victorian sofa.");
    }

    @Override
    public void showQuality() {
        System.out.println("Victorian sofa is old.");
    }
}
