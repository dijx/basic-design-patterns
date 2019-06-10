package co.devfoundry.kitchen;

public class PotatoMeal extends Meal {

    Meal meal;
    public PotatoMeal(){};

    @Override
    public void prepareMeal() {
        System.out.println("Przygotowuje danie na bazie ziemniaków");
    }
}
