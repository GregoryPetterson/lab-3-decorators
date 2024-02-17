import java.util.ArrayList;

public class GameTest {
    public static void main(String[] args) {
        GameStore gameStore = new GameStore();
        Game game = gameStore.createGame("Poker");
        
        game.shuffle();
        // The game class should probably have a variable for
        // hands to maintain a state so we don't have
        // to pass it around. Just gonna leave it alone for the lab
        // though.
        ArrayList<ArrayList<Card>> hands = game.deal(2);
        game.printDeck();

        // Print the hands
        for (int i = 0; i < 2; i++) {
            // print the player number (I added + 1 because it makes more sense to start from player 1 instead of 0)
            System.out.println("Player " + (i+1) + " has the following hand:");
            for (Card card: hands.get(i)) {
                System.out.println(card);
            }
        }

        Game war = gameStore.createGame("War");

        war.shuffle();
        ArrayList<ArrayList<Card>> handsWar = war.deal(2);
        war.printDeck();

        for (int i = 0; i < 2; i++) {
            System.out.println("Player " + (i+1) + " has the following hand:");
            for (Card card: handsWar.get(i)) {
                System.out.println(card);
            }
        }

    }
}
