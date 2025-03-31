package card;

import java.util.ArrayList;
import java.util.List;

public class SpanishCard {

    private String suit;
    private Integer value;
    private static final List<SpanishCard> deck = new ArrayList<>();

    private static final String[] suits = {"COINS", "WANDS", "SWORDS", "CUPS"};
    private static final Integer[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public SpanishCard() {}

    public SpanishCard(String suit, Integer value) {
        this.suit = suit;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public Integer getValue() {
        return value;
    }

    private void addCards() {
        if (deck.isEmpty()) {
            for (String s : suits) {
                for (int j : values) {
                    deck.add(new SpanishCard(s, j));
                }
            }
        }
    }

    public List<SpanishCard> getDeck() {
        addCards();
        return deck;
    }

    @Override
    public String toString() {
        return suit + " - " + value;
    }

}
