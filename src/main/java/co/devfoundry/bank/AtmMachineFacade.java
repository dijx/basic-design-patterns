package co.devfoundry.bank;

public class AtmMachineFacade {

    private AtmMachine atmMachine = new AtmMachine();
    private BankSystem bankSystem = new BankSystem();

    public void withdrawMoney(int amount) {

        atmMachine.enterPin();

        if (bankSystem.validatePin() && bankSystem.validateTransaction()) {

            atmMachine.checkBalance(amount);
            atmMachine.widhdrawCash(amount);
        } else {

            System.out.println("Wystąpił problem a autoryzacją");
        }
    }
}
