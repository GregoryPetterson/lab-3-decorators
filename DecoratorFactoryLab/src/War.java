import java.util.ArrayList;

public class War extends Game{
    public War() {
        deck = new ArrayList<Card>();
        for (String suit : RegularCard.suits) {
            for (String rank : RegularCard.ranks) {
                deck.add(new RegularCard(suit, rank));
            }
        }
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
