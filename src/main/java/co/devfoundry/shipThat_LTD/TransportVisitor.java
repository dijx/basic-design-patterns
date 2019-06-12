package co.devfoundry.shipThat_LTD;

public interface TransportVisitor {

    void accept(Animal animal);

    void accept(Person person);

    void accept(Shipment shipment);

}
