package deckofcards;

import java.util.*;

public class DeckOfCards {

    static String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    static String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] deck = new int[52];
        System.out.println("How many cards displayed?");
        int wanted = scan.nextInt();
        if(wanted<1||wanted>52){
            System.out.println("Be realistic please");
            System.exit(0);
        }
        System.out.println();
        initializeDeck(deck);
        shuffleDeck(deck);
        displayDeck(wanted, deck);

    }

    public static void initializeDeck(int[] deck) {
        for (int k = 0; k < deck.length; k++) {
            deck[k]=k;
                }
            }
       

    public static void displayDeck(int n, int[] deck) {
        for (int i = 0; i < n; i++) {
            int j = (deck[i]/13);
            int k = (deck[i]%13);
            System.out.println(ranks[k] + " of " + suits[j]);
        }
    }

    public static void shuffleDeck(int[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int place = (int) (Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[place];
            deck[place] = temp;

        }

    }
}
