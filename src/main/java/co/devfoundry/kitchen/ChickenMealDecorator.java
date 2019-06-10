package co.devfoundry.kitchen;

public class ChickenMealDecorator extends MealDecorator {

    Meal meal;
    public ChickenMealDecorator(Meal meal){
        this.meal = meal;
    };

    @Override
    public void prepareMeal() {
        meal.prepareMeal();
        addChicken();
    }

    private void addChicken() {
        System.out.println("Dodaję kuraczaka do potrawy");
    }
}
