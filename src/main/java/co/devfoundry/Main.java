package co.devfoundry;

import co.devfoundry.shipThat_LTD.*;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("dog", 30);
        Person person = new Person("Dawid", "Nowak", true);
        Shipment shipment = new Shipment("PL", "4325452", false);
        List<Transportable> transportableList = Arrays.asList(animal, person, shipment);

        NameTransportVisitor nameTransportVisitor = new NameTransportVisitor();
        PriceTransportVisitor priceTransportVisitor = new PriceTransportVisitor();

        for (Transportable transportable : transportableList) {

            transportable.accept(nameTransportVisitor);
            transportable.accept(priceTransportVisitor);

        }
    }

}
