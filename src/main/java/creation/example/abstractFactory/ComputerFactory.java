package creation.example.abstractFactory;

public class ComputerFactory {

    public static Computer createComputer(ComputerAbstractFactory computerAbstractFactory){
        return computerAbstractFactory.createComputer();
    }
}
