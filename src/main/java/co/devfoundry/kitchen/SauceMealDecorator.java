package co.devfoundry.kitchen;

public class SauceMealDecorator extends MealDecorator {

    Meal meal;

    public SauceMealDecorator(Meal meal){
        this.meal = meal;
    };

    @Override
    public void prepareMeal() {
        meal.prepareMeal();
        addSauce();
    }

    private void addSauce() {
        System.out.println("Danie polewam sosem");
    }
}
