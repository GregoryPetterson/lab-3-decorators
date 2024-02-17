import java.util.ArrayList;

public class GameTest {
    public static void main(String[] args) {
        GameStore gameStore = new GameStore();
        Game poker = gameStore.createGame("Poker");
        poker.shuffle();
        ArrayList<ArrayList<Card>> pokerHands = poker.deal(3);
        printHands(pokerHands);

        Game war = gameStore.createGame("War");

        war.shuffle();
        ArrayList<ArrayList<Card>> warHands = war.deal(2);

        printHands(warHands);

        Game ginRummy = gameStore.createGame("GinRummy");
        ginRummy.shuffle();
        ArrayList<ArrayList<Card>> ginRummyHands = ginRummy.deal(2);
        printHands(ginRummyHands);

        GermanGameStore germanGameStore = new GermanGameStore();

        Game germanPoker = germanGameStore.createGame("Poker");
        germanPoker.shuffle();
        ArrayList<ArrayList<Card>> germanPokerHands = germanPoker.deal(3);
        printHands(germanPokerHands);

        Game germanWar = germanGameStore.createGame("War");
        germanWar.shuffle();
        ArrayList<ArrayList<Card>> germanWarHands = germanWar.deal(2);
        printHands(germanWarHands);

        Game germanGinRummy = germanGameStore.createGame("GinRummy");
        germanGinRummy.shuffle();
        ArrayList<ArrayList<Card>> germanGinRummyHands = germanGinRummy.deal(2);
        printHands(germanGinRummyHands);


    }

    public static void printHands(ArrayList<ArrayList<Card>> hands) {
        for (int i = 0; i < hands.size(); i++) {
            System.out.println("Player " + (i + 1) + "'s hand:");
            for (Card card : hands.get(i)) {
                System.out.println(card);
            }
            System.out.println();
        }
    }
}