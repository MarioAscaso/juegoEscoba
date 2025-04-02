package card;

import java.util.ArrayList;
import java.util.List;

public class SpanishCard {

    private String suit; // Mejor como int
    private Integer value;
    // No es la mejor estructura para almacenar la baraja.
    // Ya sabes cuántas cartas tiene la baraja española: ¿un array estático mejor?
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

    // La carta NO gestiona la baraja (en todo caso es al revés)
    private void addCards() {
        if (deck.isEmpty()) {
            for (String s : suits) { // for (String suit : suits)
                for (int j : values) { // for (int value: values)
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
    // Estamos acostumbrados a verlo como: "7 de oros" -> return value + " de " + suit;
    public String toString() {
        return suit + " - " + value;
    }

}
