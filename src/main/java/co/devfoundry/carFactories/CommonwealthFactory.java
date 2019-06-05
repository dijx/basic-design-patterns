package co.devfoundry.carFactories;

public class CommonwealthFactory implements CarFactory {


    public Bmw buildBmw(Bmw.Model model) {
        return new Bmw(4500, 2019, Car.FuelType.PB98, Car.SteeringWheelPosition.RIGHT, model);
    }

    public Mercedes buildMercedes(Mercedes.Model model) {
        return new Mercedes(4500, 2019, Car.FuelType.PB98, Car.SteeringWheelPosition.RIGHT, model);
    }
}
