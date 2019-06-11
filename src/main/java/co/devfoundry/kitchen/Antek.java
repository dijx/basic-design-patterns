package co.devfoundry.kitchen;

public class Antek extends Child {

    private Child tallerChild;

    @Override
    public Child getTallerChild() {
        return tallerChild;
    }

    @Override
    public void setTallerChild(Child tallerChild) {
        this.tallerChild = tallerChild;
    }

    @Override
    public void processRequest(MotherRequest motherRequest) {
        if (motherRequest.getShelf().equals(Shelf.HIGH)) {
            System.out.println("Antek zdjął słoik z półki.");
        } else {
            tallerChild.processRequest(motherRequest);
        }
    }
}
