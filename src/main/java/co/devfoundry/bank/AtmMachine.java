package co.devfoundry.bank;

class AtmMachine {

    BankSystem bankSystem = new BankSystem();

    void checkBalance(int amount) {
        System.out.println("Sprawdzam środki do wypłaty " + amount);

    }

    void enterPin() {
        System.out.println("Pin przyjęty");
    }

    void widhdrawCash(int amount) {
        System.out.println("Przygotowanie do wypłaty " + amount);

        if (bankSystem.confirmAmountBelowBalance(amount)) {
            System.out.println("Wypłacam " + amount);
        } else {
            System.out.println("Przekroczenie środków");
        }
    }
}
