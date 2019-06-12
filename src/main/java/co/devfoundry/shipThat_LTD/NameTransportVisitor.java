package co.devfoundry.shipThat_LTD;

public class NameTransportVisitor implements TransportVisitor {

    @Override
    public void accept(Animal animal) {
        System.out.println("Przewożone zwierze: " + animal.getKind());
    }

    @Override
    public void accept(Person person) {
        System.out.println("Adresat przesyłki: " + person.getFirstName() + " " + person.getLastName());

    }

    @Override
    public void accept(Shipment shipment) {
        System.out.println("Numer przesyłki to :" + shipment.getPrefix() + shipment.getSerialNumber());
    }
}
