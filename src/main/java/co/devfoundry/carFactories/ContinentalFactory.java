package co.devfoundry.carFactories;

public class ContinentalFactory implements CarFactory {


    public Bmw buildBmw(Bmw.Model model) {
        return new Bmw(4500, 2019, Car.FuelType.PB98, Car.SteeringWheelPosition.LEFT, model);
    }

    public Mercedes buildMercedes(Mercedes.Model model) {
        return new Mercedes(4500, 2019, Car.FuelType.PB98, Car.SteeringWheelPosition.LEFT, model);
    }
}
