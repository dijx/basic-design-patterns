package co.devfoundry.fruit_slot_machine;

import java.util.Random;

public class CoinInsertedState implements State {

    public void insertCoin(FruitSlotMachine fruitSlotMachine) {

        System.out.println("Moneta już włożona, proszę rozpocząć grę!");
    }

    public void pullTheHandle(FruitSlotMachine fruitSlotMachine) {

        System.out.println("Ti ti ti ti... losowanie....");

        Random random = new Random();
        int rnd = random.nextInt(2);

        switch (rnd) {
            case 0:
                System.out.println("Przykro nam, przegrałeś... może jeszcze raz? :>");
                fruitSlotMachine.setState(new NoCoinState());
                break;

            case 1:
                System.out.println("Gratulacje! Wygrałeś! Odbierz wygraną z podajnika.");
                fruitSlotMachine.setWon(true);
                fruitSlotMachine.setState(new GameWonState());
                break;

            default:
                System.out.println("Przykro nam, przegrałeś... może jeszcze raz? :>");
                fruitSlotMachine.setState(new NoCoinState());
                break;

        }
    }

    public void takeCoinsWon(FruitSlotMachine fruitSlotMachine) {

        System.out.println("Moneta już włożona, proszę rozpocząć grę!");
    }
}
