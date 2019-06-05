package co.devfoundry.carFactories;

abstract public class Car {

    protected int engineCapacity;
    protected int yearManufactured;
    protected FuelType fuelType;
    protected SteeringWheelPosition steeringWheelPosition;

    public Car(int engineCapacity, int yearManufactured, FuelType fuelType, SteeringWheelPosition steeringWheelPosition) {
        this.engineCapacity = engineCapacity;
        this.yearManufactured = yearManufactured;
        this.fuelType = fuelType;
        this.steeringWheelPosition = steeringWheelPosition;
    }

    public Car() {
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public int getYearManufactured() {
        return yearManufactured;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public SteeringWheelPosition getSteeringWheelPosition() {
        return steeringWheelPosition;
    }


    public enum SteeringWheelPosition {
        LEFT,
        RIGHT
    }

    public enum FuelType {
        DIESEL,
        PB95,
        PB98
    }

    @Override
    public String toString() {
        return "Car{" +
                "engineCapacity=" + engineCapacity +
                ", yearManufactured=" + yearManufactured +
                ", fuelType=" + fuelType +
                ", steeringWheelPosition=" + steeringWheelPosition +
                '}';
    }
}
