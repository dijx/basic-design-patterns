package co.devfoundry.bank;

class BankSystem {

    void transferMoney() {
        System.out.println("Transfering money");
    }

    boolean validatePin() {
        System.out.println("Pin ok");
        return true;
    }

    boolean validateTransaction() {
        System.out.println("Transakcja zakończona pomyślnie");
        return true;
    }

    void getTransactionHistory() {
        System.out.println("Wyświetlam historię transakcji:/n1/n2/n3");
    }

    boolean confirmAmountBelowBalance(int amount) {
        if (amount <= 1000) {
            return true;
        } else {
            return false;
        }
    }
}
