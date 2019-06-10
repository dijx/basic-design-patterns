package co.devfoundry.kitchen;

public class ShrimpMealDecorator extends MealDecorator {

    Meal meal;

    public ShrimpMealDecorator(Meal meal){
        this.meal = meal;
    }

    @Override
    public void prepareMeal() {
        meal.prepareMeal();
        addShrimp();
    }

    private void addShrimp() {
        System.out.println("Dodaję krewetek do potrawy");
    }
}
