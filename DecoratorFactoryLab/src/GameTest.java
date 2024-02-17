public class GameTest {
    public static void main(String[] args) {
        GameStore gameStore = new GameStore();
        // Game game = gameStore.createGame("Poker");
        
        // game.shuffle();
        // game.deal(2);
        // game.printDeck();

        // // Print the hands
        // for (int i = 0; i < 2; i++) {
        //     // print the player number (I added + 1 because it makes more sense to start from player 1 instead of 0)
        //     System.out.println("Player " + (i+1) + " has the following hand:");
        //     for (Card card: game.deal(2).get(i)) {
        //         System.out.println(card);
        //     }
        // }

        Game war = gameStore.createGame("War");

        war.shuffle();
        war.deal(2);

        // for (int i = 0; i < 2; i++) {
        //     System.out.println("Player " + (i+1) + " has the following hand:");
        //     for (Card card: war.deal(2).get(i)) {
        //         System.out.println(card);
        //     }
        // }

        

    }
}
