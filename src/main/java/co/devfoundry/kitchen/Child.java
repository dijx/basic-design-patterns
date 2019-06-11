package co.devfoundry.kitchen;

public abstract class Child {

    Child tallerChild;

    public void processRequest(MotherRequest motherRequest){};

    public Child getTallerChild() {
        return tallerChild;
    }

    public void setTallerChild(Child tallerChild) {
        this.tallerChild = tallerChild;
    }
}
