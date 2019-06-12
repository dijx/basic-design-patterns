package co.devfoundry.shipThat_LTD;

public class PriceTransportVisitor implements TransportVisitor {


    @Override
    public void accept(Animal animal) {
        System.out.println("Cena za transport " + animal.getKind() + ": " + (double) animal.getWeight() * 0.2);
    }

    @Override
    public void accept(Person person) {
        String info = "zł.";
        double price = 6;

        if (person.isRegularCustomer()) {
            price = price * 0.5;
            info = "zł. (Zniżka dla stałych klientów)";
        }

        System.out.println("Cena dla " + person.getFirstName() + " " + person.getLastName()
                + ": " + price + info);

    }

    @Override
    public void accept(Shipment shipment) {
        int price = 2;
        String info = "";

        if (shipment.isLarge()) {
            price = price * 2;
            System.out.println(info = " (zwyżka za nadmiarowy gabaryt");
        }
    }
}
