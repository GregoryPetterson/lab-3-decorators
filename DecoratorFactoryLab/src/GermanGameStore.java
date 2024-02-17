public class GermanGameStore {
    public Game createGame(String gameType) {
        if (gameType.equals("Poker")) {
            return new GermanPoker(); // if gameType is "Poker", return a new Poker object
        } else if 
            (gameType.equals("War")) {
                return new GermanWar();
            } else if 
                (gameType.equals("GinRummy")) {
                    return new GermanGinRummy();
                } else
            return null; // if gameType is not one of the types mentioned above, return null
        
    }
    
}
