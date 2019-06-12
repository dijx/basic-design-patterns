package co.devfoundry.shop;

public class PriceCalculator {

    PricingStrategy pricingStrategy;

    public void calculate(int price, boolean isSignedUpForNewsletter) {

        if (pricingStrategy == null) {
            if (isSignedUpForNewsletter) {
                pricingStrategy = new SalePrice();
            } else {
                pricingStrategy = new RegularPrice();
            }
        }
        pricingStrategy.calculatePrice(price, isSignedUpForNewsletter);
    }

    public PriceCalculator(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public PriceCalculator() {
    }

    public PricingStrategy getPricingStrategy() {
        return pricingStrategy;
    }

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }
}
