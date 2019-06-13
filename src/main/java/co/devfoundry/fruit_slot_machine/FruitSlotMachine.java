package co.devfoundry.fruit_slot_machine;

public class FruitSlotMachine {

    private State state;
    private boolean won = false;


    public FruitSlotMachine() {
        this.state = new NoCoinState();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public boolean isWon() {
        return won;
    }

    public void setWon(boolean won) {
        this.won = won;
    }
}
