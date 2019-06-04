package co.devfoundry;

import java.io.Serializable;

public class GuessGame implements Serializable {

    private static final long serialVersionUID = 2131290032802092L;

    private int iloscGier= 10;
    private int score = 0;

    private static GuessGame instance = new GuessGame();

    private GuessGame() {
    }

    public static GuessGame getInstance() {
        return instance;
    }

    public void play() {

        for (int i = 0; i < iloscGier; i++) {

            score = score+=i;
        }
    }

    public int getScore() {
        return score;
    }


    protected Object readResolve() {
        return getInstance();
    }

}
