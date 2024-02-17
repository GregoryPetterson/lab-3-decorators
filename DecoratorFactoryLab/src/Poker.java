import java.util.ArrayList;

public class Poker extends Game {
    public Poker() {
        // makes a deck with one of each card
        deck = new ArrayList<Card>();
        for (String suit : RegularCard.suits) {
            for (String rank : RegularCard.ranks) {
                deck.add(new RegularCard(suit, rank));
            }
        }
        toDeal = 5;
        minPlayers = 2;
        maxPlayers = 10;
    }

    @Override
    public ArrayList<ArrayList<Card>> deal(int n) {
        if (n < minPlayers || n > maxPlayers ) {
            throw new RuntimeException("The number of players must be between " + minPlayers + " and " + maxPlayers);
        }

        ArrayList<ArrayList<Card>> hands = new ArrayList<ArrayList<Card>>(); // create a list of hands
        for (int i = 0; i < n; i++) {
            ArrayList<Card> hand = new ArrayList<Card>(); // create a hand
            for (int j = 0 ; j< toDeal; j++) {
                hand.add(deck.remove(0)); // remove the first card from the deck and add it to the hand
            }
            hands.add(hand); // add the hand to the list of hands
        }
        return hands;
    }
}
