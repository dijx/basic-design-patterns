package co.devfoundry.fruit_slot_machine;

public interface State {


    void insertCoin(FruitSlotMachine fruitSlotMachine);

    void pullTheHandle(FruitSlotMachine fruitSlotMachine);

    void takeCoinsWon(FruitSlotMachine fruitSlotMachine);

    default void displayState(FruitSlotMachine fruitSlotMachine) {
        System.out.println("Stan jednorękiego bandyty: " + fruitSlotMachine.getState());
    }

    ;

}
