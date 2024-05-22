package creation.example.factory;

import java.util.Scanner;

public class ComputerFactory {

    public static Computer createComputer(String computerType, Integer ram, Integer hardDisk){
        if("PC".equalsIgnoreCase(computerType) ){
            return new Pc(ram, hardDisk);

        }else{
            Scanner scanner = new Scanner(System.in);
            System.out.println("introduceti nr de componente: ");
            Integer numberofcomp = scanner.nextInt();

            return new Server(ram, hardDisk, numberofcomp);
        }
    }
}
