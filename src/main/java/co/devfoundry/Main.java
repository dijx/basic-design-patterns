package co.devfoundry;

import co.devfoundry.kitchen.*;

public class Main {

    public static void main(String[] args) {

        MotherRequest motherRequest = new MotherRequest(Shelf.LOW);
        Child tomek = new Tomek();
        Child ania = new Ania();
        Child antek = new Antek();
        tomek.setTallerChild(ania);
        ania.setTallerChild(antek);
        tomek.processRequest(motherRequest);
    }

}
