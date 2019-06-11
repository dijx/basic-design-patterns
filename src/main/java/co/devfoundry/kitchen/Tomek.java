package co.devfoundry.kitchen;

public class Tomek extends Child {

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
        if (motherRequest.getShelf().equals(Shelf.MEDIUM)) {
            System.out.println("Tomek zdjął słoik z półki");
        }  else {
            tallerChild.processRequest(motherRequest);
        }
    }
}
