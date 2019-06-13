package co.devfoundry.fruit_slot_machine;

public class GameWonState implements State {

    @Override
    public void insertCoin(FruitSlotMachine fruitSlotMachine) {

        if (fruitSlotMachine.isWon()) {
            System.out.println("Proszę odebrać wygraną!");
        } else {
            fruitSlotMachine.setState(new NoCoinState());
        }
    }

    @Override
    public void pullTheHandle(FruitSlotMachine fruitSlotMachine) {

        if (fruitSlotMachine.isWon()) {
            System.out.println("Proszę odebrać wygraną!");
        } else {
            fruitSlotMachine.setState(new NoCoinState());
        }
    }

    @Override
    public void takeCoinsWon(FruitSlotMachine fruitSlotMachine) {

        if (fruitSlotMachine.isWon()) {
            System.out.println("Oto Pańskie pesos, Sir!");
            fruitSlotMachine.setWon(false);
        }
        fruitSlotMachine.setState(new NoCoinState());
    }
}
