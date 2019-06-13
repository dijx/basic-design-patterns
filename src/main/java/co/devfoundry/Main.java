package co.devfoundry;

import co.devfoundry.fruit_slot_machine.FruitSlotMachine;

public class Main {

    public static void main(String[] args) {

        FruitSlotMachine fruitSlotMachine = new FruitSlotMachine();

        System.out.println(fruitSlotMachine.getState());

        fruitSlotMachine.insertCoin();
        fruitSlotMachine.pullTheHandle();
        fruitSlotMachine.takeCoinsWon();

        fruitSlotMachine.pullTheHandle();
        fruitSlotMachine.takeCoinsWon();

        fruitSlotMachine.insertCoin();
        fruitSlotMachine.takeCoinsWon();
    }

}
