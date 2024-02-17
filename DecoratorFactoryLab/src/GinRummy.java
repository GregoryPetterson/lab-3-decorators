import java.util.ArrayList;

public class GinRummy extends Game {
    public GinRummy() {
        deck = new ArrayList<Card>();
        for (String suit : RegularCard.suits) {
            for (String rank : RegularCard.ranks) {
                deck.add(new RegularCard(suit, rank));
            }
        }
        // Add two jokers to the deck
        deck.add(new Joker());
        deck.add(new Joker());

        toDeal = 10; // In Gin Rummy, each player is dealt 10 cards
        minPlayers = 2;
        maxPlayers = 2; // Gin Rummy is typically a 2-player game
    }

    @Override
    public ArrayList<ArrayList<Card>> deal(int n) {
        if (n < minPlayers || n > maxPlayers ) {
            throw new RuntimeException("The number of players must be " + maxPlayers);
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