package co.devfoundry.shop;

public class RegularPrice implements PricingStrategy {

    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {

        if (!isSignedUpForNewsletter) {
            System.out.println("Cena wynosi: " + price);
        } else {
            System.out.println("Jesteś wpisany do newslettera, należy się zniżka - wybież inną strategię");
        }
    }
}
