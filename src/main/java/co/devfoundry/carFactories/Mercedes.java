package co.devfoundry.carFactories;

public class Mercedes extends Car {

    Model model;

    public enum Model {
        W123, W124, W204
    }

    public Mercedes(int engineCapacity, int yearManufactured, FuelType fuelType, SteeringWheelPosition steeringWheelPosition, Model model) {
        super(engineCapacity, yearManufactured, fuelType, steeringWheelPosition);
        this.model = model;
    }

    public Model getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Mercedes{" +
                "model=" + model +
                ", engineCapacity=" + engineCapacity +
                ", yearManufactured=" + yearManufactured +
                ", fuelType=" + fuelType +
                ", steeringWheelPosition=" + steeringWheelPosition +
                '}';
    }
}
