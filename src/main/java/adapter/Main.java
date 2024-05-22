package adapter;

public class Main {
    public static void main(String[] args) {
        Duck duck1 = new Duck();
        duck1.fly();
        duck1.makeNoise();

        PlasticToyDuck toy1 = new PlasticToyDuck();
        toy1.squeak();

        Sparrow sparrow1 = new Sparrow();
        sparrow1.fly();
        sparrow1.makeNoise();

        BirdPlasticAction toySparrow = new BirdAdapter(sparrow1);
        toySparrow.squeak();

    }
}
