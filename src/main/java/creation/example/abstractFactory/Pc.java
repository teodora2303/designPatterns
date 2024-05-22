package creation.example.abstractFactory;



public class Pc extends Computer {

    private Integer ram;
    private Integer hardDisk;

    public Pc(Integer ram, Integer hardDisk) {
        this.ram = ram;
        this.hardDisk = hardDisk;
    }

    @Override
    public String getRam() {
        return "ram pc : " + ram;
    }

    @Override
    public String getHardDisk() {
        return "hardDisk pc: " + hardDisk;
    }
}
