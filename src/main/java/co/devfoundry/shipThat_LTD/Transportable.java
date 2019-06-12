package co.devfoundry.shipThat_LTD;

public interface Transportable {

    void accept(TransportVisitor transportVisitor);
}
