package co.devfoundry.shop;

public class SalePrice implements PricingStrategy {

    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {

        if (isSignedUpForNewsletter) {
            System.out.println("Cena z rabatem za newsletter wynosi: " + (double) price / 2);
        } else {
            System.out.println("NIE JESTEŚ wpisany do newslettera, wybież inną strategię!");
        }
    }
}
