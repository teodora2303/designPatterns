package creation.example.abstractFactory;

public class Main {
    public static void main(String[] args) {

        Computer server = ComputerFactory.createComputer(new ServerFactory(16,250,1));
        System.out.println(server.getRam());
        System.out.println(server.getHardDisk());

        Computer pc = ComputerFactory.createComputer(new PcFactory(8,152));
        System.out.println(pc.getHardDisk());
        System.out.println(pc.getRam());
    }
}
