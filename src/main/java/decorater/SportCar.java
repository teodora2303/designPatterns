package decorater;

public class SportCar extends CarDecorator{
    private int horsePowerToAdd;

    public SportCar(Car car, int horsePowerToAdd) {
        super(car);
        this.horsePowerToAdd = horsePowerToAdd;
    }

    public SportCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Added sports elements. New horse power " + super.car.changeHorsePower(horsePowerToAdd));
    }
}
