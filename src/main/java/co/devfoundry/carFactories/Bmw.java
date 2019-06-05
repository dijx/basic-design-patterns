package co.devfoundry.carFactories;

public class Bmw extends Car {

    Model model;

    public enum Model {
        E30, E36, E46
    }

    public Bmw(int engineCapacity, int yearManufactured, FuelType fuelType, SteeringWheelPosition steeringWheelPosition, Model model) {
        super(engineCapacity, yearManufactured, fuelType, steeringWheelPosition);
        this.model = model;
    }

    public Model getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Bmw{" +
                "model=" + model +
                ", engineCapacity=" + engineCapacity +
                ", yearManufactured=" + yearManufactured +
                ", fuelType=" + fuelType +
                ", steeringWheelPosition=" + steeringWheelPosition +
                '}';
    }
}
