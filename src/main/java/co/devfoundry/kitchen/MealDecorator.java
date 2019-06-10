package co.devfoundry.kitchen;

public abstract class MealDecorator extends Meal{

    Meal meal;

    MealDecorator(Meal meal){};
    MealDecorator(){};

    @Override
    public void prepareMeal() {
        this.meal.prepareMeal();
    }
}
