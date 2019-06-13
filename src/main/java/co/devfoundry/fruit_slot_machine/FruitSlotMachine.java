package co.devfoundry.fruit_slot_machine;

public class FruitSlotMachine {

    private State state;
    private boolean won;


    public FruitSlotMachine() {
        this.state = new NoCoinState();
        this.won = false;
    }

    public State getState() {
        return state;
    }

    void setState(State state) {
        this.state = state;
    }

    public boolean isWon() {
        return won;
    }

    void setWon(boolean won) {
        this.won = won;
    }


    public void insertCoin() {

        this.state.insertCoin(this);
    }


    public void pullTheHandle() {

        this.state.pullTheHandle(this);
    }


    public void takeCoinsWon() {

        this.state.takeCoinsWon(this);
    }
}
