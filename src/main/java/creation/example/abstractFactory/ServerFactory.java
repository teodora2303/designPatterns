package creation.example.abstractFactory;

public class ServerFactory implements ComputerAbstractFactory {

  private Integer ram;
  private Integer hardDisk;
  private Integer numberOfComp;

    public ServerFactory(Integer ram, Integer hardDisk, Integer numberOfComp) {
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.numberOfComp = numberOfComp;
    }

    @Override
    public Computer createComputer() {
        return new Server(ram, hardDisk, numberOfComp);


    }
}
