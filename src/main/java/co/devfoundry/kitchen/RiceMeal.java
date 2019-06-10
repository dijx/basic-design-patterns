package co.devfoundry.kitchen;

public class RiceMeal extends Meal {

    public RiceMeal(){};

    @Override
    public void prepareMeal() {
        System.out.println("Przygotowuje danie na bazie ryżu");
    }
}
