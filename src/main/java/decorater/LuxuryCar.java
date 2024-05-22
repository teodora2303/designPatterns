package decorater;

public class LuxuryCar extends CarDecorator{

    private boolean leatherSeats;

    public LuxuryCar(Car car, boolean leatherSeats) {
        super(car);
        this.leatherSeats = leatherSeats;
    }

    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding luxury elements. Leather seats: " + leatherSeats);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LuxuryCar{");
        sb.append("leatherSeats=").append(leatherSeats);
        sb.append('}');
        return sb.toString();
    }
}
