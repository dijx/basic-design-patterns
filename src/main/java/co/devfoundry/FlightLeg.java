package co.devfoundry;

public class FlightLeg {

    private String from;
    private String to;
    private boolean delayed;
    private double price;

    private FlightLeg (FlightLegBuilder flightLegBuilder){
        this.from = flightLegBuilder.from;
        this.to = flightLegBuilder.to;
        this.price = flightLegBuilder.price;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public boolean isDelayed() {
        return delayed;
    }

    public double getPrice() {
        return price;
    }

    public void setDelayed(boolean delayed) {
        this.delayed = delayed;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String  toString() {
        return "FlightLeg{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", delayed=" + delayed +
                ", price=" + price +
                '}';
    }

    public static class FlightLegBuilder {

        private String from;
        private String to;
        private boolean delayed;
        private double price;

        public FlightLeg build() {
            return new FlightLeg(this);
        }


    }

}
