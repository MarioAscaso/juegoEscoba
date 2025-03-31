package output;

import card.SpanishCard;

public class OutputScreen implements OutputInterface {

    private static final String format = "| %-126s |";

    public static void separator(){System.out.println("|--------------------------------------------------------------------------------------------------------------------------------| ");}
    public static void welcome() {System.out.printf(format, " - WELCOME TO THE BROOM GAME - ");}
    public static void messageOfTheDeckWeAreGoingToUse() {System.out.printf(format, " - THIS IS THE DECK WE ARE GOING TO PLAY WITH - ");}
    public static void showDeck(SpanishCard spanishCard) {
        String formatCard = "| %-6s %-2d |";
        System.out.printf(formatCard, spanishCard.getSuit(), spanishCard.getValue());}
    public static void linebreak() {System.out.println();}
    public static void askNamePlayer1(){System.out.print("| - ENTER NAME PLAYER 1: ");}
    public static void askNamePlayer2(){System.out.print("| - ENTER NAME PLAYER 2: ");}
}
