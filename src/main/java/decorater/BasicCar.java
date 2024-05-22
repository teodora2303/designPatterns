package decorater;

public class BasicCar implements Car{

    private String color;
    private int horsePower;

    public BasicCar(String color, int horsePower) {
        this.color = color;
        this.horsePower = horsePower;
    }

    @Override
    public void assemble() {
        System.out.println("preparing basic car" +" " +  color +" " + horsePower);

    }

    @Override
    public int changeHorsePower(int value) {
        this.horsePower += value;
        return horsePower;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BasicCar{");
        sb.append("color='").append(color).append('\'');
        sb.append(", horsePower=").append(horsePower);
        sb.append('}');
        return sb.toString();
    }
}
