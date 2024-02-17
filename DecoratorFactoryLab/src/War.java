import java.util.ArrayList;

public class War extends Game{
    public War() {
        deck = new ArrayList<Card>();
        for (String suit : RegularCard.suits) {
            for (String rank : RegularCard.ranks) {
                deck.add(new RegularCard(suit, rank));
            }
        }

        toDeal = 26; 
        minPlayers = 2;
        maxPlayers = 2;
    }

    @Override
    public ArrayList<ArrayList<Card>> deal(int n) {
        if (!(n == minPlayers)) {
            throw new RuntimeException("Only two players can play can play War.");
        }
        if (n * toDeal > 52) {
            throw new RuntimeException("Not enough cards in the deck.");
        }

        ArrayList<ArrayList<Card>> hands = new ArrayList<ArrayList<Card>>(); // create a list of hands
        for (int i = 0; i < n; i++) {
            ArrayList<Card> hand = new ArrayList<Card>(); // create a hand
            for (int j = 0 ; j < toDeal; j++) {
                hand.add(deck.remove(0)); // remove the first card from the deck and add it to the hand
            }
            hands.add(hand); // add the hand to the list of hands    
        }
        System.out.println(hands);
        return hands;
    }
}
