package dealer;

import card.SpanishCard;
import main.Main;
import output.OutputInterface;
import output.OutputScreen;

import java.util.List;

public class Dealer {

    private static final SpanishCard spanishCard = new SpanishCard();

    public static void checkDeck() {
        int contador = 0;
        List<SpanishCard> deck = spanishCard.getDeck();
        for (SpanishCard card : deck) {
            OutputScreen.showDeck(card);
            contador++;
            if(contador == 10){
                OutputScreen.linebreak();
                contador = 0;
            }
        }
    }

}
