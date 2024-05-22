package adapter;

public class Duck implements BirdAction{
    @Override
    public void fly() {

        System.out.println("Duck can fly");
    }

    @Override
    public void makeNoise() {

        System.out.println("quack, quack");
    }
}
