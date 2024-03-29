public class GameStore {
    public Game createGame(String gameType) {
        if (gameType.equals("Poker")) {
            return new Poker(); // if gameType is "Poker", return a new Poker object
        } else if 
            (gameType.equals("War")) {
                return new War();
            } else if 
                (gameType.equals("GinRummy")) {
                    return new GinRummy();
                } else
            return null; // if gameType is not one of the types mentioned above, return null
        
    }
    
}
