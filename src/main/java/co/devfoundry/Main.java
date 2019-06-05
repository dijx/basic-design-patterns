package co.devfoundry;

import co.devfoundry.carFactories.*;

public class Main {

    public static void main(String[] args) {

        CarFactory continentalFactory = new ContinentalFactory();
        CarFactory commonwealthFactory = new CommonwealthFactory();

        Car bmw1 = continentalFactory.buildBmw(Bmw.Model.E30);
        Car bmw2 = commonwealthFactory.buildBmw(Bmw.Model.E46);
        Car merc1 = continentalFactory.buildMercedes(Mercedes.Model.W123);
        Car merc2 = commonwealthFactory.buildMercedes(Mercedes.Model.W204);

        System.out.println(bmw1);
        System.out.println(bmw1.getSteeringWheelPosition());
        System.out.println(bmw2);
        System.out.println(merc1);
        System.out.println(merc2);

    }

}
