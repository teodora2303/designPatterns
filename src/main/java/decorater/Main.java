package decorater;

import javax.swing.plaf.basic.BasicCheckBoxMenuItemUI;

public class Main {
    public static void main(String[] args) {

        Car basicCar = new BasicCar("red", 170);
      //  basicCar.assemble();

        Car lucuryCar = new LuxuryCar(basicCar,true);
      //  lucuryCar.assemble();

        Car sportLuxuryCar = new SportCar(lucuryCar,50);
       // sportLuxuryCar.assemble();
        Car basicCar2 = new BasicCar("Green",90);
        Car sportCar = new SportCar(basicCar2,20);
        sportCar.assemble();

    }
}
