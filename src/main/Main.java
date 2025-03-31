package main;

import dealer.Dealer;
import input.InputKeyboard;
import output.OutputScreen;
import person.Person;

public class Main {

    private static Person player1;
    private static Person player2;

    public static void main(String[] args) {
        OutputScreen.separator();
        OutputScreen.welcome();
        OutputScreen.linebreak();
        OutputScreen.messageOfTheDeckWeAreGoingToUse();
        OutputScreen.linebreak();
        OutputScreen.separator();
        Dealer.checkDeck();
        OutputScreen.separator();
        OutputScreen.askNamePlayer1();
        String player1name = InputKeyboard.getStringValue();
        player1.setName();
        OutputScreen.askNamePlayer2();
        String player2name = InputKeyboard.getStringValue();
    }

}
