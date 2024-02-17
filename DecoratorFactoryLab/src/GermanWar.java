import java.util.ArrayList;

public class GermanWar extends Game{
    public GermanWar() {
        // makes a deck with one of each card
        deck = new ArrayList<Card>();
        for (String suit : GermanCard.suits) {
            for (String rank : GermanCard.ranks) {
                deck.add(new GermanCard(suit, rank));
            }
        }
        deck.add(new Joker());
        deck.add(new Joker());
        
        toDeal = 27;
        minPlayers = 2;
        maxPlayers = 2;
    }

    @Override
public ArrayList<ArrayList<Card>> deal(int n) {
    ArrayList<ArrayList<Card>> hands = new ArrayList<ArrayList<Card>>();
    for (int i = 0; i < n; i++) {
        hands.add(new ArrayList<Card>());
    }

    for (int i = 0; i < toDeal; i++) {
        for (ArrayList<Card> hand : hands) {
            if (deck.size() > 0) { // Check if there are cards left in the deck
                hand.add(deck.remove(deck.size() - 1));
            } else {
                System.out.println("Not enough cards in the deck to deal");
                return hands;
            }
        }
    }

    return hands;
}
}
