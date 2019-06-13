package co.devfoundry.fruit_slot_machine;

public class NoCoinState implements State {

    public void insertCoin(FruitSlotMachine fruitSlotMachine) {

        System.out.println("Moneta włożona, możesz grać");
        fruitSlotMachine.setState(new CoinInsertedState());
    }

    public void pullTheHandle(FruitSlotMachine fruitSlotMachine) {

        System.out.println("Proszę najpierw włożyć monetę!");
        //System.out.println("Ti ti ti ti... losowanie....");
    }

    public void takeCoinsWon(FruitSlotMachine fruitSlotMachine) {

        System.out.println("Proszę najpierw wrzucić monetę, rozpocząć grę i wygrać :)");
        //System.out.println("Gratulacje, wygrałeś! Odbierz wygraną z podajnika!");
    }

}
